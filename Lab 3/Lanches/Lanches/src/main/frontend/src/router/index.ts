import { createRouter, createWebHistory } from 'vue-router';
import LanchesView from '@/views/LanchesView.vue';

const routes = [
    {
        path: '/',       
        name: 'lanches',        
        component: LanchesView 
    }
];

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
});

export default router;
