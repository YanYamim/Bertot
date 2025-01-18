import LanchesView from "@/views/LanchesView.vue";
import { compile } from "vue";
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
    {
        path: '/lanches',
        name: 'lanches',
        component: LanchesView
    }
    ]
});

export default router;