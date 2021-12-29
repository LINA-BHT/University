<template>
  <v-row justify="center">
    <v-dialog v-model="dialog" persistent max-width="800px">
      <template v-slot:activator="{ on }">
        <v-btn outlined color="indigo lighten-4" dark v-on="on">Plus</v-btn>
      </template>
      <v-card>
        <v-card-title>
          
        
        <p class="subheading grey--text text-center">Notre Enseignant</p>
        <span class="material-icons">person_add</span>

        </v-card-title>
         <v-form>
                          <v-text-field
                            label="Non"
                            name="Non"
                            prepend-icon="person"
                            type="text"
                            color="indigo darken-3"
                          />
                          <v-text-field
                            label="prenom"
                            name="prenon"
                            prepend-icon="person"
                            type="text"
                            color="indigo darken-3"
                          />
                          
                          <v-text-field
                            id="adresse"
                            label="adresse"
                            name="adresse"
                            prepend-icon="house"
                            type="text"
                            color="indigo darken-3"
                          />
                          <v-text-field
                            label="Email/adresse du compte"
                            name="Email"
                            prepend-icon="email"
                            type="text"
                            color="indigo darken-3"
                          />
                          
                             <v-text-field
                            id="password"
                            label="password du compte"
                            name="password"
                            prepend-icon="lock"
                            type="password"
                            color="indigo darken-3"
                          />
                          
                          
                          
                          <v-text-field
                            id="diplome"
                            label="diplome"
                            name="diplome"
                            prepend-icon="school"
                            type="text"
                            color="indigo darken-3"
                          />
                          
                          
                          
  
  
             
                          
        <v-card-actions>
          <v-spacer></v-spacer>
          
          <v-btn color="red" @click="submit">Supprimer</v-btn>
          <v-btn color="green" >Modifier</v-btn>
          <v-btn color="indigo darken-3" text @click="dialog = false">fermer</v-btn>
        </v-card-actions>
                        </v-form>
                        
      </v-card>
    </v-dialog>
  </v-row>
</template>

<script>
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
      ]
      
    }),
    methods: {
         formatDate (date) {
        if (!date) return null
        const [year, month, day] = date.split('-')
        return `${year}/${month}/${day}`
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