import Vue from 'vue'
import VueRouter from 'vue-router'
import Etudiant from '../views/Etudiant.vue'
import Enseignant from '../views/Enseignant.vue'
import Cours from '../views/Cours.vue'
import salle from '../views/Salle.vue'
import Login from '../views/Login.vue'
import Home from '../views/Home.vue'
import Departments from '../views/Departments.vue'
import ListEns from '../views/ListEns.vue'
import Diplomes from '../views/Diplomes.vue'
import Detail from '../views/Detail.vue'



Vue.use(VueRouter)

const routes = [
   
 
  {
    path: '/',
    name: 'home',
    component: Home
  },
 
  {
    path: '/detail',
    name: 'detail',
    component: Detail
  },
  
  {
    path: '/listEns',
    name: 'listEns',
    component: ListEns
  },
  {
    path: '/etudiant',
    name: 'etudiant',
    component: Etudiant
  },
  {
    path: '/enseignant',
    name: 'enseignant',
    component: Enseignant
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    //component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/cours',
    name: 'cours',
    component: Cours
  },
  {
    path: '/diplomes',
    name: 'diplomes',
    component: Diplomes
  },
  {
    path: '/salle',
    name: 'salle',
    component: salle
  },
  {
    path: '/departments',
    name: 'departments',
    component: Departments
  },
  {
    path: '/login',
    name: 'login',
    component: Login
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router