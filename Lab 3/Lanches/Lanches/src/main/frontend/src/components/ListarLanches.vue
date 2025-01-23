<template>
    <div class="listar-lanche">
        <div v-if="lanches.lenght > 0">
            <div v-for="lanche in lanches" :key="lanche.lancheId" class="lanche-card">
                <div class="lanche-header">
                    <h3>{{ lanche.nome }}</h3>
                </div>
                <div class="lanche-actions">
                    <button class="botao-compra" @click="comprarLanche">Comprar</button>
                </div>
            </div>
        </div>
        <p v-else>Nenhum lanche cadastrado</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            lanches: []
        };
    },

    mounted() {
        this.listarLanches();
    },

    async listarLanches() {
        try {
            const response = await fetch('http://localhost:8080/lanches/listar');
            if (!response.ok) throw new Error("Erro ao listar lanches");
            const lanches = await response.json();
            console.log(lanches);
            return lanches;
        } catch (error) {
            console.error(error);
            alert("Erro ao carregar a lista de lanches");
        }
    }

}


</script>