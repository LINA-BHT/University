<template>
  <v-content>
    <HeadAccueil />
    <LatestPost />
   
    
  </v-content>
</template>

<script>
import HeadAccueil from "../components/HeadAccueil";
import LatestPost from "../components/LatestPost";


export default {
  name: "Home",

  components: {
    HeadAccueil,
    LatestPost
  }
};
</script>