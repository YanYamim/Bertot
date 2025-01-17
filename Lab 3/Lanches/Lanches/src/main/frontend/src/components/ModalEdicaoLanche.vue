<template>
    <div class="modal-overlay">
        <div class="modal-content">
            <h2 class="modal-titulo">Edição de Lanche</h2>
            <form @submit.prevent="editarLanche" class="modal-form">
                <label for="nome">Nome:</label>
                <input v-model="lancheEmEdit.nome" type="text" id="nome" required class="modal-input" />

                <label for="tipo">Tipo:</label>
                <input v-model="lancheEmEdit.tipo" type="text" id="tipo" required class="modal-input" />

                <button @click="salvarLanche" class="botao-salvar-lanche">Salvar</button>
                <button @click="cancelarLanche" class="botao-cancelar-lanche">Cancelar</button>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    name: 'modalEicaoLanche',
    emits: ['close', 'save'],
    props: {
        modalAberto: Boolean,
        lanches: Array
    },
    data() {
        return {
            lancheEmEdit: {
                id: this.lanche.id,
                nome: this.lanche.nome,
                tipo: this.lanche.tipo
            },
            abrirModal: false
        }
    },
    methods: {
        fecharModal() {
            this.$emit('close');
        },
        saveChanges() {
            this.$emit('save', this.lancheEmEdit);
            this.fecharModal();
        }
    }
}
</script>