<template>
  <v-content>
    <div class="staticHero">
      <v-img src="../assets/images/21.jpeg">
      <v-row align="end" class="lightbox white--text pa-2 fill-height">
        <v-col>
          <v-container>
            <div class="headline">Contacter nous pour plus d'information</div>
          </v-container>
        </v-col>
      </v-row>
    </v-img>
    </div>
    <div class="block">
      <v-container>
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
  </v-content>
</template>

<script>
export default {
  name: "Contact",
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