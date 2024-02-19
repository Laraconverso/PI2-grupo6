# PI2-grupo6 
<div align="center">
  <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/4f29a572-1021-4683-b93d-276df21a7de6" alt="Banner de Fútbol">
</div>
<br>
CLUBAPP🥅⚽ es un Website responsive que brinda a clubes de fútbol una plataforma básica para gestionar a sus jugadores y empleados (directores técnicos) de manera eficiente, y por otro lado ofrecer a los usuarios una interfaz atactiva y sencilla de utilizar.

## Tabla de Contenidos 
##### volver 
- [Integrantes](#integrantes)
- [Demo](#demo)
- [Tecnologías](#tecnologías)
- [Características](#características)
- [Diagrama_de_red](#diagrama_de_red)
- [Uso](#uso)
- [Estructura_Backend](#estructura_backend)
- [Estructura_Frontend](#estructura_frontend)
- [Instalación](#instalación)
- [Licencia](#licencia)

## Integrantes 

- Pablo Alvarez [@AlvarezPablo1](https://github.com/AlvarezPablo1)
- Romina Cavallaro [@Romycavallaro](https://github.com/Romycavallaro)
- Perla Chalón [@perlachalon](https://github.com/perlachalon)
- Jennifer Colman [@JennyECB](https://github.com/JennyECB)
- Fabrizzio Coniglio [@fabriconiglio](https://github.com/fabriconiglio)
- Lara Converso [@Laraconverso](https://github.com/Laraconverso)
- María Fernanda García [@mafegarciap](https://github.com/mafegarciap)
- Nixon Gómez 
- Matías Menoni [@rookie623](https://github.com/rookie623)
- Andrea Papagno [@AndreaMPapagno](https://github.com/AndreaMPapagno)
- Sebastian Robayo [@sebasRT](https://github.com/sebasRT)
- Gisela Urriza [@Gigi-U](https://github.com/Gigi-U)

- [volver](#volver)
## Demo

(🚧 gif de app cuando este desplegada)
- [volver](#volver)

## Tecnologías

<div >
       <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/b9d215ac-51c7-4b2e-bf81-8daa4f9b0f73" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/3a5ac61a-8763-4da7-a90f-f21c7365f3be" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/4457567e-d1ea-4053-9eae-9885bd5d5af3" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/a11f45b5-4eb1-4ee1-91f5-7eb5315e9dbe" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/261f55d9-07f8-4505-a28c-61233762303f" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/1e227b6d-238f-422f-9bbf-1588c1d23ca2" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/d76961f2-08ec-471e-9833-57ed4f3f6205" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/01f03cfb-579b-48a0-8578-c85706d19ae5" width="80px">
        <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/4179f03a-bb76-49c0-b1cc-91a30d53560a" width="80px">
</div>
           
- [volver](#volver)

## Características

    ✔️ validación de usuarios por dni
    ✔️ login de usuarios
    ✔️ Gestión de jugadores como usuario empleado
    ✔️ Interfaz de usuario responsive    
- [volver](#volver)

## Diagrama_de_red
<p align="center">
  <img src="https://github.com/Laraconverso/PI2-grupo6/assets/87839629/0214ecff-18e3-4cc0-80d9-32cfbfee6537" alt="Descripción de la imagen" width="70%">
</p>

- [volver](#volver)

## Uso

(🚧 con que usuario loguearse para poder gestionar)

- [volver](#volver)

## Estructura_Backend

    ClubAPP
        |_src
            |_main
                |_java/com/APIclubApp/clubApp
                    |_controller
                    |   - ClubController.java
                    |   - EmployeeController.java
                    |   - PlayerController.java
                    |_model
                    |   - Category.java
                    |   - Club.java
                    |   - Coach.java
                    |   - Employee.java
                    |   - Fixture.java
                    |   - Game.java
                    |   - Payment.java
                    |   - Player.java
                    |   - Role.java
                    |   - Statistics.java
                    |   - Team.java
                    |   - User.java            
                    |_repository
                    |   - ClubRepository.java
                    |   - EmployeeRepository.java
                    |   - PlayerRepository.java
                    |_service
                        |_ impl
                        |   - ClubServiceImpl.java
                        |   - EmployeeServiceImpl.java
                        |   - PlayerServiceImpl.java
                        - ClubService.java
                        - EmployeeService.java
                        - PlayerService.java
                    - ClubAppApplication.java
                    
- [volver](#volver)

### Estructura_Frontend

    front-end
        |_public (images)
        |_src
            |_app
            |   |_admin
            |   |   |_forms
            |   |       - CreateDT.tsx
            |   |       - CreateUser.tsx
            |   |       - LoginAdmin.tsx
            |   |    - page.tsx  
            |   |_login
            |   |    - LoginUserForm.tsx
            |   |    - page.tsx    
            |   |_user
            |       - page.tsx
            |   - globals.css
            |   - layout.tsx
            |   - page.tsx
            |_auth    
            |   - signIn.ts
            |_components
            |   |_fixture
            |   |   - FixtureContainer.tsx
            |   |   - Matches.tsx
            |   |_header
            |   |   |_navbar
            |   |       - Admin.tsx
            |   |       - Logged.tsx
            |   |       - Navbar.tsx                
            |   |       - Unlogged.tsx
            |   |   - Header.tsx
            |   |   - LogIn.tsx
            |   |   - SignUp.tsx
            |   |_teams
            |   |   - Team.tsx
            |   |   - TeamContainer.tsx
            |   - Footer.tsx
            |_fonts (fonts)
            |_lib
                - actions.ts
            - auth.ts
            - lib.ts
            - middleware.ts    
        - next.config.mjs
        - package-lock.json
        - package.json
        - postcss.config.js
        - tailwind.config.ts
        - tsconfig.json
        
- [volver](#volver)

## Instalación 

### Clona el repositorio en tu máquina local

    git clone git@github.com:Laraconverso/PI2-grupo6.git

### Front-end

    ```bash
    npm install

    npm run dev
    # or
    yarn dev
    # or
    pnpm dev
    # or
    bun dev
    ```
Abrir en [http://localhost:3000](http://localhost:3000)

- [volver](#volver)

## Licencia

    MIT License

    Copyright (c) 2024 Lara Converso

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
    
- [volver](#volver)
