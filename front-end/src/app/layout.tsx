import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import Header from "@/components/header/Header";
import React, { ReactNode } from "react";
import Footer from "@/components/Footer";

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Club App",
  description: "Proyecto final integrador",
};

export default function RootLayout(props: {
  children: ReactNode
}) {
  return (
    <html lang="es">
      <body className={inter.className}>
        <Header/>
        {props.children}
        <Footer/>
      </body>
    </html>
  );
}
