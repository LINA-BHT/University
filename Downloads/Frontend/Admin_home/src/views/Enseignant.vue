<template>
  <div class="team">
    <NavbarAdmin/>
    <h1 class="subheading grey--text text-center">Nos Enseignants</h1> 
    <v-flex
        sm6
        xs12
        md6
        lg3
      >
       <v-card class="ma-3" color="orange darken-3"
            dark>
    <v-list-item  >
      
      <v-list-item-content>
        <v-list-item-title class="headline mb-1 text-right" >{{nb}}</v-list-item-title>
        <div><v-divider></v-divider></div>
      </v-list-item-content> 
    </v-list-item>
    <v-card-actions>
      <v-icon text class="ma-2">person</v-icon>
      <div class="overline">Nombre Enseignant</div>
    </v-card-actions>
  </v-card>
      </v-flex>
      
    <template>
  <v-text-field label="Entrée Matricule">
   
    <v-icon
      slot="append" color="red">search
    </v-icon>
    <v-icon
      slot="prepend" color="green">person
    </v-icon>
  </v-text-field>
  </template>

        <template>
  <v-simple-table >
         <template v-slot:default>
      <thead>
        <tr>
                <th class="text-left"> Matricule </th>
                <th class="text-left"> Nom </th>
                <th class="text-left"> Prenom </th>
                <th class="text-left"> Adresse  </th>
                <th class="text-left"> diplôme</th>
                <th class="text-left"> email  </th>
                <th>plus</th>
            </tr>
      </thead>
      <tbody>
        <tr v-for = "etudiant in etudiants" v-bind:key = "etudiant.matricule">
          <td>{{etudiant.matricule}}</td>
          <td>{{etudiant.nomENS}} </td>
          <td>{{etudiant.prenomENS}}</td>
          <td>{{etudiant.adresseENS}}</td>
          <td>{{etudiant.diplome}}</td>
          <td>{{etudiant.email}}</td>
          
          <td>
         <v-flex class="mt-4 mb-4">
             
                <PlusEns />
               </v-flex></td>
         
        </tr>
      </tbody>
    </template>
  </v-simple-table>
 </template>
  
  

  </div>
</template>

<script>
import PlusEns from '../components/PlusEns.vue'
import EtudiantService from '../service/EnseignantService'
import NavbarAdmin from '../components/NavbarAdmin.vue'
// @ is an alias to /src
export default {
  name: 'team',
  components: {
   PlusEns,
   NavbarAdmin
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