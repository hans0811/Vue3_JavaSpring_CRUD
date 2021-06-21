import {createRouter, createWebHashHistory, createWebHistory} from 'vue-router'
import Home from '../views/Home.vue'
import Pagefour from "@/views/PageFour";
import PageOne from "@/views/PageOne";
import PageTwo from "@/views/PageTwo";

const routes = [
  {
    path: '/',
    name: 'BookManager',
    component: Home,
    redirect:"/pageOne",
    show: true,
    children:[
      {
        path: '/pageOne',
        name: 'Search Book',
        meta: { show: true },
        component: () => import(/* webpackChunkName: "about" */ '../views/PageOne.vue')
      },
      {
        path: '/pageTwo',
        name: 'Add Book',
        meta: { show: true },
        component: () => import(/* webpackChunkName: "about" */ '../views/PageTwo.vue')
      },
      {
        path:"/update",
        name:"update",
        meta: { show: false },
        component: () => import(/* webpackChunkName: "about" */ '../views/update'),
      }
    ]
  },



]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
