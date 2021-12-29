<template>
  <div class="team">
    <NavbarAdmin/>
    <h1 class="subheading grey--text text-center">Nos etudiants</h1> 
    <v-flex sm4 xs12 md6 lg3>
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
      <div class="overline">Nombre Etudiants</div>
    </v-card-actions>
  </v-card>
      </v-flex>
 
    <template>
  <v-text-field label="Entrée le num d'inscription">
   
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
                <th class="text-left"> Num d'inscription </th>
                <th class="text-left"> Nom </th>
                <th class="text-left"> Prenom </th>
                <th class="text-left"> Adresse  </th>
                <th class="text-left"> Date d'éntrée </th>
                <th class="text-left"> email  </th>
              
                <th>plus</th>
            </tr>
      </thead>
      <tbody>
        <tr v-for = "etudiant in etudiants" v-bind:key = "etudiant.id">
          <td>{{etudiant.id}}</td>
          <td>{{etudiant.nom}} </td>
          <td>{{etudiant.prenom}}</td>
          <td>{{etudiant.adresse}}</td>
          <td>{{etudiant.dateEntrée}}</td>
          <td>{{etudiant.email}}</td>
          
          
          <td>
         <v-flex class="mt-4 mb-4">
             
                <Plus />
               </v-flex></td>
         
        </tr>
      </tbody>
    </template>
  </v-simple-table>
 </template>
 




  </div>
</template>

<script>
import Plus from '../components/Plus.vue'
import EtudiantService from '../service/EtudiantService'

import NavbarAdmin from '../components/NavbarAdmin.vue'
export default {
  name: 'team',
  components: {
   Plus,
   NavbarAdmin,
  
  
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
      },
      
    },
    
    created(){
      this.getEtudiants()
    }
      
    
      
      }
    
</script>