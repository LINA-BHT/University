<template>
  
  <v-container>
    <Navbar/>
    <h1 class="subheading grey--text text-center">Nos Cours</h1>
    

   <template>

  <v-card>
    <v-toolbar color="orange darken-3" dark flat prominent>
      
     <span class="material-icons">school</span>
    <v-toolbar-title>Classer par niveau d'étude : Licence ,Master ,Doctorat</v-toolbar-title>
      <template v-slot:extension>
        <v-tabs
          v-model="tabs"
          centered
        >
          <v-tab
            v-for="n in 3"
            :key="n"
          >
            Diplôme {{ n }}
          </v-tab>
        </v-tabs>
      </template>
    </v-toolbar>

    <v-tabs-items v-model="tabs">


      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <h1>Nos licences</h1>
            <v-tabs vertical>
      <v-tab>
        <v-icon left>computer </v-icon> Informatique de gestion
      </v-tab>
      <v-tab>
        <v-icon left>point_of_sale</v-icon>Gestion
      </v-tab>
      <v-tab>
        <v-icon left>
         calculate
        </v-icon>
        Economique
      </v-tab>

      <v-tab-item>
        <v-card flat>
          <v-card-text>
             <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                <th class="text-left">Niveau d'etude</th>
                </tr>
      </thead>
      <tbody>
        <tr v-for = "etudiant in etudiants" v-bind:key = "etudiant.libelle">
          <td>{{etudiant.libelle}}</td>
          <td>{{etudiant.description}}</td>
          <td>{{etudiant.niveau}}</td>
        </tr>  
        
        
      </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                <th class="text-left">Niveau d'etude</th>
                </tr>
      </thead>
      <tbody>
        <tr v-for = "etudiant in gestion" v-bind:key = "etudiant.libelle">
          <td>{{etudiant.libelle}}</td>
          <td>{{etudiant.description}}</td>
          <td>{{etudiant.niveau}}</td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                <th class="text-left">Niveau d'etude</th>
                </tr>
      </thead>
      <tbody>
        <tr v-for = "etudiant in eco" v-bind:key = "etudiant.libelle">
          <td>{{etudiant.libelle}}</td>
          <td>{{etudiant.description}}</td>
          <td>{{etudiant.niveau}}</td>
        </tr> 
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
    </v-tabs>
              
          </v-card-text>
        </v-card>
      </v-tab-item>



      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <h1>Nos Masters</h1>
            
         
          
            

            <v-tabs vertical>
      <v-tab>
        <v-icon left>computer </v-icon> Informatique de gestion
      </v-tab>
      <v-tab>
        <v-icon left>point_of_sale</v-icon>Gestion
      </v-tab>
      <v-tab>
        <v-icon left>
         calculate
        </v-icon>
        Economique
      </v-tab>

      <v-tab-item>
        <v-card flat>
          <v-card-text>
             <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>JAVA</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>JEE</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>Conception</td>
          <td>cours pour 1eme Informatique de getsion</td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme BIS et BI</td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>fiscalité</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>micro</td>
          <td>cours pour 2eme </td>
        </tr>  
        <tr>
          <td>Algébre</td>
          <td>cours pour 1eme </td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme </td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>Macro</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>algébre</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>statistique</td>
          <td>cours pour 1eme Informatique de getsion</td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme BIS et BI</td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
    </v-tabs>
          </v-card-text>
        </v-card>
      </v-tab-item>

      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <h1>Nos Doctorat</h1>
          
            <v-tabs vertical>
      <v-tab>
        <v-icon left>computer </v-icon> Informatique de gestion
      </v-tab>
      <v-tab>
        <v-icon left>point_of_sale</v-icon>Gestion
      </v-tab>
      <v-tab>
        <v-icon left>
         calculate
        </v-icon>
        Economique
      </v-tab>

      <v-tab-item>
        <v-card flat>
          <v-card-text>
             <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>JAVA</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>JEE</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>Conception</td>
          <td>cours pour 1eme Informatique de getsion</td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme BIS et BI</td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>fiscalité</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>micro</td>
          <td>cours pour 2eme </td>
        </tr>  
        <tr>
          <td>Algébre</td>
          <td>cours pour 1eme </td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme </td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
      <v-tab-item>
        <v-card flat>
          <v-card-text>
            <v-simple-table >
         <template v-slot:default>
      <thead>
         <thead>
                <tr>
                <th class="text-left"> Nom du cours </th>
                <th class="text-left"> Description </th>
                </tr>
      </thead>
      <tbody>
        <tr>
          <td>Macro</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>algébre</td>
          <td>cours pour 2eme BIS</td>
        </tr>  
        <tr>
          <td>statistique</td>
          <td>cours pour 1eme Informatique de getsion</td>
        </tr>  
        <tr>
          <td>Django</td>
          <td>cours pour 3eme BIS et BI</td>
        </tr>  
        </tbody>   
        </template>
        </v-simple-table>
 
          </v-card-text>
        </v-card>
      </v-tab-item>
    </v-tabs>
          </v-card-text>
        </v-card>
      </v-tab-item>
    </v-tabs-items>
  </v-card>
  </template>
  
  </v-container>
</template>


<script>
import EtudiantService from '../service/CoursService'
import Navbar from '../components/Navbar.vue'
  export default {
    data () {
      return {
        tabs: null,
        etudiants : [],
        nb : [],
        gestion : [],
        eco : [],
        cours : []
        
      }
    },
    components: {
      Navbar
  
  },
    
    methods:{
      getEtudiants(){
        EtudiantService.getEtudiants().then((response) =>{
          this.etudiants = response.data
        });
      },
      getGestion(){
        EtudiantService.getgestion().then((response) =>{
          this.gestion = response.data
        });
      },
      getEco(){
        EtudiantService.geteco().then((response) =>{
        this.eco = response.data
        });
      },
      getnombre(){
        EtudiantService.getnombre().then((response) =>{
        this.cours = response.data, this.nb=response.data.length
        });
      }
      

      
    },
    
    created(){
      this.getEtudiants()
      this.getGestion()
      this.getEco()
      this.getnombre()
    }
      
  }
</script>