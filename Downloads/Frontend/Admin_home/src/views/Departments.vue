<template>
  <div class="team">
    <h1 class="subheading grey--text">Departements</h1>
    <v-container >
      <Navbar/>
      <v-layout row wrap>
       
        <v-flex xs12 sm6 md4 lg3 v-for="person in etudiants" :key="person.nomDEP">
              <v-card class="text-center ma-3">
                <v-responsive class="pt-4">
                   <v-avatar size="100" class="red lighten-2">
                     <img :src="person.avatar" alt="" >
                   </v-avatar>
                </v-responsive>
                <v-card-text>
                  <div class="subheading">{{person.nomDEP}}</div>
                  
                </v-card-text>

                
                    <v-btn outlined color="orange" text router :to="'/detail'">
                        <v-icon small left >arrow_forward</v-icon>
                        <span>Details</span>
                    </v-btn>
                
              </v-card>
        </v-flex>
       
      </v-layout>
    </v-container>
  </div>
</template>

<script>
import EtudiantService from '../service/DepartementService'
// @ is an alias to /src
import Navbar from '@/components/Navbar.vue'
export default {
  name: 'departments',
  components: {
    Navbar
   
  },
  data(){
    return{
      etudiants : [

      ],
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