<template>
  <v-row justify="center">
    <v-dialog v-model="dialog" persistent max-width="800px">
      <template v-slot:activator="{ on }">
        <v-btn outlined color="indigo accent-1" dark v-on="on">Ajouter Etudiant</v-btn>
      </template>
      <v-card>
        <v-card-title>
          
        
        <p class="subheading grey--text text-center">Ajouter un nouveau Cours</p>
        <span class="material-icons">person_add</span>

        </v-card-title>
         <v-form @submit="save">
                          <v-text-field
                            label="Non de cours"
                            name="Non"
                            prepend-icon="person"
                            type="text"
                            color="indigo darken-3"
                            v-model="etud.libelle"
                          />
                          <v-text-field
                            label="description"
                            name="description"
                            prepend-icon="person"
                            type="text"
                            color="indigo darken-3"
                            v-model="etud.description"
                          />
                          
                          <v-text-field
                            id="diplome"
                            label="type de diplome lequel appartient"
                            name="diplome"
                            prepend-icon="house"
                            type="text"
                            color="indigo darken-3"
                            v-model="etud.diplome"
                          />
                          <v-text-field
                            label="Niveau d'etude"
                            name="niveau"
                            prepend-icon="email"
                            type="text"
                            color="indigo darken-3"
                            v-model="etud.niveau"
                          />
                          
                             <v-text-field
                            id="spécilaité"
                            label="spécialité lequel appartient"
                            name="spécialité"
                            prepend-icon="lock"
                            type="text"
                            color="indigo darken-3"
                            v-model="etud.spécialité"
                          />
                          
                          
                          
                         
                          
                   
                          
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="indigo darken-3" text @click="dialog = false">fermer</v-btn>
          <v-btn color="green" text outlined @click="submit">Enregistrer</v-btn>
        </v-card-actions>
                        </v-form>
                        
      </v-card>
    </v-dialog>
  </v-row>
</template>

<script>
import EtudiantService from '../service/CoursService'

export default {
    data: vm => ({
      dialog: false,

      title:'',
      content:'',
      due:null,
      date: new Date().toISOString().substr(0, 10),
      dateFormatted: vm.formatDate(new Date().toISOString().substr(0, 10)),
      menu1: false,
      inputRules: [
          v => v.length >= 3 || 'Minimum lenght is 3 charachters' 
      ],
      
     etud:
       {
       libelle: "",
       niveau: "",
       description :"",
       diplome :"",
       spécialité: "",
       
      
      },
    }),
     
      
      
      
    
    methods: {
         formatDate (date) {
        if (!date) return null
        const [year, month, day] = date.split('-')
        return `${year}/${month}/${day}`
      },
      submit()
      {
      EtudiantService.create(this.etud)
      .then((response) =>{
      console.log(response);
      }
      )
      

      },


      parseDate (date) {
        if (!date) return null
        const [year, month, day] = date.split('/')
        return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
      },
    },
    computed: {
      computedDateFormatted () {
        return this.formatDate(this.date)
      },
    },
    watch: {
      date () {
        this.dateFormatted = this.formatDate(this.date)
      },
    },
}
</script>