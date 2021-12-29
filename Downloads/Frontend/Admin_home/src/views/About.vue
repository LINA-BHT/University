<template>
  <v-content>
    <div class="staticHero">
      <v-img src="../assets/images/22.png">
        <v-row align="end" class="lightbox white--text pa-2 fill-height">
          <v-col>
            <v-container>
              <div class="headline">About Us</div>
            </v-container>
          </v-col>
        </v-row>
      </v-img>
    </div>
    <div class="block">
      <v-container>
        <p>L’Université de Tunis (1958-2018) : soixante ans au service de l’enseignement, de la recherche et de la formation des cadres En 2018, l’Université de Tunis a fêté symboliquement son soixantième anniversaire, car elle n’a pas été créée ex-nihilo. Érigée sur des fondations antérieures, elle a réuni des éléments précurseurs, dans une synergie et convergence qui aboutirent à une structure juridiquement reconnue. C’est la loi sur la réforme de l’enseignement de 1958 qui lui a donné une pré-naissance. Ce fut un texte synthétique, consacrant l’existence de facto d’un enseignement supérieur éclaté. Deux ans après, le décret du 13 mars 1960 constituera l’acte de naissance officiel d’une Université nationale qui réussit à rassembler des filières dispersées et des sections disparates, qui tenaient lieu d’un enseignement supérieur, surtout depuis la création en 1945, de l’Institut des Hautes Etudes de Tunis, rattaché à l’Académie de Paris. Depuis 1960, plusieurs textes de lois ont vu le jour pour organiser l’enseignement supérieur et la recherche scientifique. En décembre 1987, notre université a été baptisée Université des Lettres, des Arts et des Sciences Humaines. En 2000 elle recouvra sa désignation initiale à savoir, Université de Tunis. Eclatée dans l’espace, l’université de Tunis réunit aujourd’hui 15 établissements d’enseignement et de recherche. Elle compte une faculté, dix instituts et quatre écoles qui offrent une large panoplie de disciplines et de filières et préparent à divers diplômes.</p>
      </v-container>
    </div>
    <div class="block">
      <v-container>
        <h2 class="text-center">Our Teams</h2>
        <v-row>
          <v-col v-for="item in items" :key="item.id" class="d-flex child-flex" cols="12" sm="4">
            <v-card flat tile class="mx-auto">
              <v-img :src="item.src" aspect-ratio="1" class="grey lighten-2"></v-img>
              <v-card-text class="text--primary text-center">
                <div class="title">{{ item.name }}</div>
                <p>{{ item.title }}</p>
              </v-card-text>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </div>
  </v-content>
</template>

<script>
export default {
  name: "About",
  data() {
    return {
      items: [
        {
          id: 1,
          src: require("../assets/images/HabibSidhom2.jpg"),
          name: 'Pr. Habib Sidhom',
          title: 'Président de l Université de Tunis'
        },
        {
          id: 2,
          src: require("../assets/images/SaoussenKrichen.jpg"),
          name: 'Pr. Saoussen Krichen',
          title: 'Vice-Président de l UT'
        },
        {
          id: 3,
          src: require("../assets/images/KhaledKchir.jpg"),
          name: 'Pr. Khaled Kchir',
          title: 'Vice-Président de l UT'
        }
      ]
    };
  }
};
</script>