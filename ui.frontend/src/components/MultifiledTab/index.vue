<template>
  <div>
    <div v-for="item in multifieldOne" :key="item">
      <h1>{{ item.item }}</h1>
    </div>
    <div v-for="item in multifieldTwo" :key="item">
      <h3>{{ item.textOne }}</h3>
      <h3>{{ item.textTwo }}</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MultifieldTab',
  props: {
    multifieldOne: {
      type: Array,
      default: () => [
        {
          item: 'Eu sou um texto'
        }
      ]
    },
    multifieldTwo: {
      type: Array,
      default: () => [
        {
          textOne: 'Eu sou o texto 1',
          textTwo: 'Eu sou o texto 2'
        }
      ]
    }
  }
}
</script>
