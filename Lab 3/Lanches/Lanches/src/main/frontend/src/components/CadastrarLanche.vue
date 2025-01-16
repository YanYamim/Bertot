<template>
    <div class="lanche-cadastrados">
        <div class="novo-lanche">
            <button class="botão-cadastrar-lanche" @click="toggleNovoLanche">Cadastrar Lanche</button>

            <div v-if="exibirNovoLanche" class="formulario-cadastro">
                <form @submit.prevent="validadorDadosNovoLanche">
                    <input
                        class="campo-nome-cadastro"
                        type="text"
                        v-model="lancheNovo.lancheNome"
                        placeholder="Nome do Lanche"
                    />
                    <input
                        class="campo-tipo-cadastro"
                        type="text"
                        v-model="lancheNovo.lancheTipo"
                        placeholder="Tipo do Lanche"
                    />
                    <button class="botao-salvar" @click="salvarLanche">Salvar</button>
                    <button class="botao-cancelar" @click.prevent="cancelarCadastro">Cancelar</button>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            lanches: [],
            novoLanche: {lancheNome: '', lancheTipo: ''},
            exibirNovoLanche: false,
        }
    },
    methods: {
        toggleNovoLanche() {
            this.exibirNovoLanche = !this.exibirNovoLanche;
        },
        
        async salvarLanche() {
            const requestOptions = {
                method: 'POST',
                headers: {'Content-Type': 'application/json'},
                body: JSON.stringify(this.novoLanche)
            }
            const response = await fetch('http://localhost:8080/lanches/cadastrar', requestOptions)
            const data = await response.json()
            this.$emit('novo-lanche', data)
        },

        validadorDadosNovoLanche() {
            if(this.novoLanche.lancheNome && this.novoLanche.lancheTipo) {
                this.salvarLanche()
                this.novoLanche.lancheNome = ''
                this.novoLanche.lancheTipo = ''
            }
        },

        cancelarCadastro() {
            this.novoLanche = { lancheNome: '', lancheTipo: '' }
            this.exibirNovoLanche = false
        }

    }
}
</script>