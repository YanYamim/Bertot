<template>
    <div>
        <CadastrarLanche @novo-lanche="adicionarLanche" />
        <ListarLanches :lanches="lanches" @editar-lanche="iniciarEdicao" />
        <ModalEdicaoLanche
            v-if="lancheEmEdit"
            :lanche="lancheEmEdit"
            @salvar-edicao="salvarEdicao"
            @fechar="fecharModal" />
    </div>
</template>

<script>
import CadastrarLanche from '@/components/CadastrarLanche.vue';
import ListarLanches from '@/components/ListarLanches.vue';
import ModalEdicaoLanche from '@/components/ModalEdicaoLanche.vue';

export default {
    name: 'LancheView',
    components: {
        CadastrarLanche,
        ListarLanches,
        ModalEdicaoLanche
    },
    data() {
        return {
            tags: [],
            tagEmEdit: null
        }
    }
}
</script>