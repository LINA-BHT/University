<template>
   <nav>
       <v-app-bar  color="indigo darken-3" dark app >
           <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
           <v-toolbar-title class="text-uppercase ">
               <span class="font-weight-light"></span>
               <span>Welcome</span>
               
           </v-toolbar-title>
           <v-spacer></v-spacer>
           <v-menu offset-y>
      <template v-slot:activator="{ on }">
        <v-btn
          text
          v-on="on"
        >
          <v-icon left>expand_more</v-icon>
            <span>Menu</span>
        </v-btn>
      </template>
      <v-list flat>
        <v-list-item v-for="link in links"  :key="link.text" router :to="link.route" active-class="border">
          <v-list-item-title >{{link.text}}</v-list-item-title>
        </v-list-item>
      </v-list>
            </v-menu>
            <v-btn text router :to="'/'">
                <span>Déconnecter</span>
                <v-icon right>exit_to_app</v-icon>
             </v-btn>
       </v-app-bar>
      <v-navigation-drawer  v-model="drawer" dark app class="indigo darken-3">
          <v-layout column align-center>
               <v-flex class="mt-5"> 
                    <v-avatar size="150">
                            <img src="../assets/isg.png" alt="">
                    </v-avatar>
                    <p class="white--text subheading mt-1 text-center">Admin</p>
               </v-flex>
               <v-flex class="mt-4 mb-4">
             
                <Popup />
               </v-flex>
               <v-flex class="mt-4 mb-4">
             
                <Newens />
               </v-flex>
          </v-layout>
          <v-list flat>
              <v-list-item v-for="link in links"  :key="link.text" router :to="link.route" active-class="border">
                  <v-list-item-action>
                     <v-icon >{{link.icon}}</v-icon>
                  </v-list-item-action>
                  <v-list-item-content >
                      <v-list-item-title >{{link.text}}</v-list-item-title>
                  </v-list-item-content>
              </v-list-item>
          </v-list>
      </v-navigation-drawer>
   </nav>
</template>
<script>
import Popup from './Popup.vue'
import Newens from './Newens.vue'
export default {
   data: () => ({
      drawer: true,
      links :[
          {icon: 'group', text:'Etudiants', route: '/etudiant'},
          {icon: 'school', text:'Enseignants', route: '/enseignant'},
          {icon: 'auto_awesome_motion', text:'Cours', route: '/cours'},
          {icon: 'sensor_door', text:'Salles', route: '/salle'}
      ]
     
    }),
    components: {
    Popup,
    Newens
  },
   
}
</script>
<style scoped>
.border {
  border-left: 4px solid #0ba518;
}
</style>