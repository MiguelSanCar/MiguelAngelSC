import 'package:clicker/pages/juego.dart';
import 'package:clicker/pages/login.dart';
import 'package:clicker/pages/sing_up.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  MyApp({super.key});

  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      
      title: "Car Clciker",
      initialRoute: "/login",
      routes: {
        "/login": (BuildContext context) => claseLogin(),
        "/juego":(BuildContext context) => claseJuego(),
         "/sing_up":(BuildContext context) => claseRegistro(),
      },
    );
  }
}
