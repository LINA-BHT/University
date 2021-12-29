<template>
  <div class="block latestPostBlock">
    <v-container>
      <h2 class="text-center">Liste des Universites</h2>
      <v-row>
        <v-col v-for="item in items" :key="item.id" cols="12" md="4">
          <v-card outlined class="mx-auto">
            <v-img
              class="white--text align-end"
              height="200px"
              :src="item.src"
            >
              <v-card-title>{{ item.title }}</v-card-title>
            </v-img>
            <v-card-subtitle class="pb-0">{{ item.subtitle }}</v-card-subtitle>
            <v-card-text class="text--primary">
              <div>{{ item.description }}</div>
            </v-card-text>
            <v-card-actions>
              <v-btn color="primary" text :href="item.url">Plus</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  name: "LatestPost",
  data: () => ({
    show: false,
    items: [
      {
        id: 1,
        title: "Institut Superieure de Gestion de Tunis",
        subtitle: "1,000 miles of wonder",
        description: "L'institut est fondé en juillet 1969 et sort sa première promotion en juin 1971",
        src: require("../assets/images/11.jpg"),
        url: "http://localhost:8081/app1"
      },
      {
        id: 2,
        title: " Institut Superieur des Beaux Arts de Tunis",
        subtitle: "2,000 miles of wonder",
        description: "Etablissement scientifique relevant de l´Université de Tunis.Créé en 1923 sous forme d´un Centre pour l´enseignement des beaux-arts a l´impasse Ben Ayed dans la Médina de Tunis et en 1930 le centre est transformé en une Ecole des Beaux-arts.",
        src: require("../assets/images/10.png"),
        url: "http://www.isbat.rnu.tn/"
      },
      {
        id: 3,
        title: "Institut Superieur de l’Animation pour la Jeunesse et la Culture",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/12.jpg"),
        url:"http://www.isajc.rnu.tn/"
      },
      {
        id: 4,
        title: "Institut Superieur Prép. des Etudes Littéraires et des Sciences Humaines de Tunis",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/13.jpg"),
        url:"http://www.ipelsht.rnu.tn/"
      },
      {
        id: 5,
        title: "Institut Superieur des Etudes Appliquées en Humanités de Tunis",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/14.png"),
        url: "http://www.iseaht.rnu.tn/"
      },
      {
        id: 6,
        title: "Tunis Business School",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/15.png"),
        url:"http://www.utunis.rnu.tn/tbs"
      },
          {
        id: 7,
        title: "École Normale Supérieure tunis",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/16.png"),
        url:"http://www.ens.rnu.tn/"
      },
          {
        id: 8,
        title: "École Nationale Supérieure d'Ingénieurs de Tunis",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/17.png"),
        url:"http://www.ensit.tn/"
      },
          {
        id: 9,
        title: "École Supérieure des Sciences Economiques et Commerciales de Tunis",
        subtitle: "3,000 miles of wonder",
        description: "L'Institut Supérieur de l'Animation pour la Jeunesse et la Culture (ISAJC) est un établissement doté de la personnalité morale, de l'autonomie financière et d'un budget rattaché pour ordre au budget de l'Etat. Il est placé sous la tutelle du Ministère de l'Enseignement Supérieur selon la loi n° 5-95 du 2 janvier 1995.",
        src: require("../assets/images/18.png"),
        url: "http://www.essect.rnu.tn/"
      }

    ]
  })
};
</script>+