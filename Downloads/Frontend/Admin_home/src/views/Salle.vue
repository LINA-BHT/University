<template>
<v-container>
<NavbarAdmin/>
<h1 class="subheading grey--text text-center">Nos Salle et leurs dispinibilité</h1>
 <template>
  <v-card>
    <v-tabs
      v-model="tab"
      background-color="primary"
      dark
    >
      <v-tab
        v-for="salle in salles"
        :key="salle.noml"
      >
        {{ salle.noml }}
      </v-tab>
    </v-tabs>

    <v-tabs-items v-model="tab">
      <v-tab-item
        v-for="salle in salles"
        :key="salle.noml"
      >
        <v-card flat>
          <v-card-text>
               
         <Dispo />
    




  
            
      </v-card-text>
        </v-card>
      </v-tab-item>
    </v-tabs-items>
  </v-card>
 </template>
 <template>
  <v-row align="center" justify="space-around">
    <v-col cols="12" sm="6" md="3">
          <v-text-field label="Entrée le nom du cours"></v-text-field>
    </v-col>

   <v-btn depressed color="error">supprimer</v-btn>
    <v-flex class="mt-4 mb-4">
             
                <AjouterSalle />
               </v-flex>
    
    
  </v-row>
 </template>


</v-container>
</template>
<script>
import AjouterSalle from '../components/AjouterSalle'
import  Dispo from '../components/Dispo.vue'
import EtudiantService from '../service/SalleService'
import NavbarAdmin from '../components/NavbarAdmin.vue'

  export default {
     components: {
      Dispo,
      AjouterSalle,
      NavbarAdmin
    },
    data () {
      return {
        salles : [],
        nb : [],
        tab: null,
        
        
      }
    },
    
    methods:{
      getEtudiants(){
        EtudiantService.getEtudiants().then((response) =>{
          this.salles = response.data, this.nb=response.data.length
        });
      }

    },
    created(){
      this.getEtudiants()
    }
  }
</script>