<template>
  <div id="app">
    <div class="main-content">

      <header class="header">
        <h1>Gerenciador de Lanches</h1>
        <ListarLanches :lanches="lanches" @editar-lanche="edtarLanche"/>
      </header>

      <RouterView />
    </div>
  </div>
</template>

<script>
import { RouterView } from 'vue-router';
import ListarLanches from './components/ListarLanches.vue';

export default {
  name: "App",
  components: {
    ListarLanches
  }
}

</script>


<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
