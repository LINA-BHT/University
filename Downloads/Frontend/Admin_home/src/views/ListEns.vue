<template>
  <div class="team">
   
    <h1 class="subheading grey--text">Enseignants</h1>
    <v-container >
       <Navbar/>
      <v-layout row wrap>
        <v-flex xs12 sm6 md4 lg3 v-for="person in etudiants" :key="person.name">
              <v-card class="text-center ma-3">
                
                <v-responsive class="pt-4">
                   <v-avatar size="100" class="red lighten-2">
                     <img :src="person.avatar" alt="" >
                   </v-avatar>
                </v-responsive>
                <v-card-text>
                  <div class="subheading">{{person.nomENS}}</div>
                  <div class="grey--text">{{person.diplome}}</div>
                </v-card-text>
              </v-card>
        </v-flex>
       
      </v-layout>
    </v-container>
  </div>
</template>

<script>
// @ is an alias to /src
import EtudiantService from '../service/EnseignantService'
import Navbar from '@/components/Navbar.vue'
export default {
  name: 'team',
  components: {
    Navbar
   
  },
  data(){
      return{
      etudiants : [],
      nb : [],
    }
    
    },
    methods:{
      getEtudiants(){
        EtudiantService.getEtudiants().then((response) =>{
          this.etudiants = response.data, this.nb=response.data.length
        });
      }

    },
    created(){
      this.getEtudiants()
    }
    
    

}
</script>