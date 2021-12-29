import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import login from '../views/login.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
   
    component: Home,
    children: [
      {
        path: '',
        component: () => import(/* webpackChunkName: "Overview" */ '../views/cours.vue')
      },
      {
        path: 'etudiant',
        component: () => import(/* webpackChunkName: "Messages" */ '../views/etudiant.vue')
      },
      {
        path: 'enseignant',
        component: () => import(/* webpackChunkName: "Profile" */ '../views/enseignant.vue')
      },
      {
        path: 'cours',
        component: () => import(/* webpackChunkName: "Settings" */ '../views/cours.vue')
      },
      
    ]
  },
  {
    path: '/login',
    name: 'login',
    
    component: login
  },
  
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
