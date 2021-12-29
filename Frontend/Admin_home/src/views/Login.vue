<template>
  <v-app id="inspire">
      <Navbar/>
      <v-container fluid>
          <v-col>
            <v-card >
              <v-window v-model="step">
                <v-window-item :value="1">
                  <v-row>
                    <v-col >
                      <v-card-text >
                        <h1 
                          class="text-center display-2 indigo--text text--darken-3"
                        >Se conncter à l'ISG</h1>
                        <div class="text-center mt-4">
                          <v-btn  icon href="https://www.facebook.com/ISG.tunis.tn" target="_blank" class="mx-2" fab color="black" outlined>
                            <v-icon>fab fa-facebook-f</v-icon>
                          </v-btn>

                          <v-btn icon href="http://www.isg.rnu.tn/" target="_blank" class="mx-2" fab color="black" outlined>
                            <v-icon>fab fa-google-plus-g</v-icon>
                          </v-btn>
                          <v-btn icon href="https://www.linkedin.com/school/institutsup%C3%A9rieurdegestiondetunis/" target="_blank" class="mx-2" fab color="black" outlined >
                            <v-icon>fab fa-linkedin-in</v-icon>
                          </v-btn>
                          

                        </div>

                        <h4 class="text-center mt-4">Assurez-vous de votre e-mail pour l'inscription</h4>
                        <v-form>
                          <v-text-field
                            label="Email"
                            name="Email"
                            prepend-icon="email"
                            type="text"
                            color="indigo darken-3"
                          />

                          <v-text-field
                            id="password"
                            label="Password"
                            name="password"
                            prepend-icon="lock"
                            type="password"
                            color="indigo darken-3"
                          />
                        </v-form>
                        <h3 class="text-center mt-4">Mot de passe oublié ?</h3>
                      </v-card-text>
                      <div class="text-center mt-3">
                        <v-btn rounded color="indigo darken-3" dark router :to="'/etudiant'">Se Connecter</v-btn>
                      </div>
                    </v-col>
                    <v-col cols="12" md="4" class="indigo darken-3">
                        <v-img :src="require('@/assets/isg.png')" height="150px" width="170px">  </v-img>
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">Bienvenue Parmi Nous!</h1>
                     </v-card-text>
                     
                      
           
                       <div class="text-center">
                        <v-btn rounded outlined dark @click="step++">Pour plus d'info</v-btn>
                        </div>
                    </v-col>
                  </v-row>
                </v-window-item>
               <v-window-item :value="2">
                  <v-row class="fill-height">
                    <v-col cols="12" md="4" class="indigo darken-3">
                        <v-img :src="require('@/assets/isg.png')" height="150px" width="170px">  </v-img>
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">Bienvenue Parmi Nous!</h1>
                     </v-card-text>
                     
                      
           
                       <div class="text-center">
                        <v-btn rounded outlined dark @click="step++">Se Connecter</v-btn>
                        </div>
                    </v-col>

                    <v-col cols="12" md="8">
                      <v-card-text class="mt-12">
                        <h1 class="text-center display-2 indigo--text text--darken-3">Institut Supérieur De Gestion De Tunis</h1>
                        <div class="text-center mt-4">
                          <v-btn class="mx-2" fab color="black" outlined>
                            <v-icon>fab fa-facebook-f</v-icon>
                          </v-btn>

                          <v-btn class="mx-2" fab color="black" outlined>
                            <v-icon>fab fa-google-plus-g</v-icon>
                          </v-btn>
                          <v-btn class="mx-2" fab color="black" outlined>
                            <v-icon>fab fa-linkedin-in</v-icon>
                          </v-btn>
                        </div>
                        <h4 class="text-center mt-4">L'Institut supérieur de gestion de Tunis ou ISG est un établissement universitaire tunisien rattaché à l'université de Tunis.</h4>
                        <br>
                        <h4 class="text-center mt-4">Adresse : 41 Av. de la Liberte, Tunis 2000</h4>
                           <h4 class="text-center mt-4">Téléphone : 71 588 514</h4> 
                           <h4 class="text-center mt-4">Notre Directeur : Slim Chaouachi</h4> 
                      </v-card-text>
                      
                    </v-col>
                  </v-row>
                </v-window-item>
              </v-window>
            </v-card>
          </v-col>

      </v-container>

  </v-app>
</template>

<script>
import Navbar from '@/components/Navbar.vue'
export default {
    components: {
    Navbar
  },
  data: () => ({
    step: 1
  }),
  props: {
    source: String
  }
};
</script>