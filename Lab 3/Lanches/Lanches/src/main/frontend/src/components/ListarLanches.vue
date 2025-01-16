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
import axios from 'axios';

export default {
    data() {
        return {
            lanches: []
        };
    },

    mounted() {
        this.buscarLanches();
    },

    methods: {
        buscarLanches() {
            axios.get('http://localhost:8080/lanches/listar')
                .then(response => {
                    this.lanches = response.data;
                    console.log(this.lanches[0]);
                })
                .catch(error => {
                    console.error('Erro ao achar lanches: ', error);
                });
        }
    }
}

</script>