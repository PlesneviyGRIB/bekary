import React from 'react';
import ReactDOM from 'react-dom/client';
import {ProductListPage} from "./pages/ProductListPage";
import 'bootstrap/dist/css/bootstrap.min.css';
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import {NotFoundPage} from "./pages/NotFoundPage";
import {ProductPage} from "./pages/ProductPage";
import {PagePath} from "./types";
import {Interceptor} from "./components/Interceptor";

export const debounce = require('lodash.debounce');

const root = ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
);

const router = createBrowserRouter([
    {
        path: PagePath.NOT_FOUND,
        element: <NotFoundPage/>,
        errorElement: <NotFoundPage/>,
    },
    {
        path: PagePath.PRODUCTS,
        element: <ProductListPage/>,
    },
    {
        path: "/products/:productId",
        element: <ProductPage/>,
    },
]);

root.render(
    <>
        <Interceptor />
        <RouterProvider router={router}/>
    </>
);
