<template>
  <v-container fluid>
      <Navbar/>
      <v-img src="../assets/images/about-us.jpg">
      <v-row align="end" class="lightbox white--text pa-2 fill-height">
      </v-row>
    </v-img>
    <div class="block">
      <v-container>
        
      </v-container>
 <p>L'Institut supérieur de gestion de Tunis (arabe : المعهد العالي للتصرف بتونس) ou ISG est un établissement universitaire tunisien rattaché à l'université de Tunis.</p>
 <p>L'institut a de nombreuses spécialisations2 :

licence fondamentale en informatique de gestion
licence fondamentale en gestion
licence appliquée en informatique décisionnelle
licence appliquée en comptabilité
licence appliquée en économie
licence appliquée en marketing et communication
master professionnel en sécurité des systèmes informatiques
master professionnel en marketing et commerce international
master professionnel en comptabilité
master professionnel en qualité, sécurité et environnement
master professionnel en gestion des ressources humaines et développement des compétences
master professionnel en ingénierie financière
master professionnel en assurance et actuariat
master professionnel en risk management
master de recherche en méthode intelligente pour l'aide à la décision
master de recherche en informatique et gestion de la connaissance
master de recherche en administration et stratégies des affaires
master de recherche en marketing
master de recherche en management des RH et organisation
master de recherche en finance
master de recherche en décision
master de recherche en prévision
master de recherche en enterprise systems engineering
doctorat en informatique de gestion
doctorat en gestion</p>
      <v-container>
          <h2>Contacter nous</h2>
        <v-form ref="form" v-model="valid" lazy-validation>
          <v-text-field v-model="name" :counter="10" :rules="nameRules" label="Name" required></v-text-field>
          <v-text-field v-model="email" :rules="emailRules" label="E-mail" required></v-text-field>
          <v-textarea v-model="message" :rules="messageRules" label="Message" required></v-textarea>
          <v-btn :disabled="!valid" color="success" class="mr-4" @click="validate">Submit</v-btn>
          <v-btn color="error" class="mr-4" @click="reset">Reset</v-btn>
        </v-form>
      </v-container>
    </div>
    <div class="googlemap">
     <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d51107.91332844651!2d10.14112693395719!3d36.81265861599675!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12fd33f3ba46d313%3A0xcbabe0cb54f9606!2z2KzYp9mF2LnYqSDYqtmI2YbYsw!5e0!3m2!1sfr!2stn!4v1535717889425" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen=""></iframe>
    </div>
  </v-container>
</template>

<script>
import Navbar from '@/components/Navbar.vue'
export default {
  name: "Contact",
  components: {
   Navbar
  },
  data: () => ({
    valid: true,
    name: "",
    nameRules: [
      v => !!v || "Name is required",
      v => (v && v.length <= 10) || "Name must be less than 10 characters"
    ],
    email: "",
    emailRules: [
      v => !!v || "E-mail is required",
      v => /.+@.+\..+/.test(v) || "E-mail must be valid"
    ],
    message: "",
    messageRules: [
      v => !!v || "Message is required",
      v => (v && v.length >= 10) || "Message must be more than 10 characters"
    ],
  }),

  methods: {
    validate() {
      if (this.$refs.form.validate()) {
        this.snackbar = true;
      }
    },
    reset() {
      this.$refs.form.reset();
    }
  }
};
</script>