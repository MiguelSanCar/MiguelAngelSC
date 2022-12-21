// ignore_for_file: sort_child_properties_last

import 'dart:async';
import 'dart:math';

import 'package:audioplayers/audioplayers.dart';
import 'package:flutter/material.dart';
import 'package:footer/footer.dart';

import 'login.dart';

import 'package:assets_audio_player/assets_audio_player.dart';

//repositorios externos a flutter
import 'package:transparent_image_button/transparent_image_button.dart';

class Coche {
  String nombre;
  String rutaImagen;
  Color colorCoche;

  int precioMejoraRuedas = 0;
  int precioMejoraTurbo = 0;
  int precioMejoraMotor = 0;

  //tienda
  //variable comprable para las ruedas, multiplica las ganancias
  int nivelRuedas = 0;
  //multiplicador de clicks
  //variable para multiplicar las ganancias
  int multiplicador = 0;

  Coche({
    required this.nombre,
    required this.multiplicador,
    required this.rutaImagen,
    required this.colorCoche,
    required this.precioMejoraRuedas,
    required this.precioMejoraTurbo,
    required this.precioMejoraMotor,
  }) {}
}

int contDinero = 0; //monedas

final player = AudioPlayer();

void playFile(String url) {
  player.play(AssetSource(url));
}

class claseJuego extends StatefulWidget {
  @override
  InterfazJuego createState() => InterfazJuego();
}

//variables que tienen que ser globales
List<Coche> listCoches = ArrayCoches();
int cocheActual = 0;




bool nivelRuedasActive = true;
bool nivelTurboActive = true;
bool nivelMotorActive = true;

//variables para el boton de mejora de coches
int contMejoraCoches = 0;


Image imagenMejoraCoches =
    Image.asset("images/lvlUp.png", opacity: const AlwaysStoppedAnimation(.4));

//variables de las imagenes
Image turbo = Image.asset("images/turbo.png");
Image motor = Image.asset("images/motor.png");
Image ruedas = Image.asset("images/mejoraRuedas.png");

class InterfazJuego extends State<claseJuego> {
  bool btnLvlUp = false;

  


  //variables para boton aleatorio
  bool btnVisible = false;
  double x = 0;
  double y = 0;

  @override
  void initState() {
    super.initState();
    comprobar();
  }
  
  double precioMejoraLvlUp = 0.0;

  //contador para saber cuantas mejoras se han comprado
  int contMejoras = 0;

  void comprobar() {
    late Timer timer;

    timer = Timer.periodic(const Duration(milliseconds: 10), (_) {
      setState(() {
        comprobarMejoraCoches();
        precioMejoraLvlUp = listCoches[cocheActual].precioMejoraMotor.toInt() * 1.5;
      });
    });

    timer = Timer.periodic(const Duration(seconds: 2), (_) {
      int random = Random().nextInt(100);
      setState(() {
        // print(random);
        if (random == 50 && btnVisible == false) {
          btnVisible = true;
          x = Random().nextInt(425).toDouble();
          y = Random().nextInt(260).toDouble();
        }

        if (nivelTurboActive == false) {
          double precioMejoraRuedas2 = listCoches[cocheActual].precioMejoraRuedas / 2;
          contDinero = contDinero + precioMejoraRuedas2.toInt();
          
        }
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          automaticallyImplyLeading: false,
          leading: Icon(Icons.account_circle_rounded),
          title: Text(
            datos.usuario,
            style: TextStyle(fontFamily: "Impint MT Shadow"),
          ),
          backgroundColor: Color.fromARGB(255, 234, 40, 66),
          actions: [
            IconButton(
              icon: Icon(Icons.restore),
              onPressed: () {
                setState(() {
                  reset();

                  nivelRuedasActive = true;
                  nivelMotorActive = true;
                  nivelTurboActive = true;

                  turbo = Image.asset("images/turbo.png");
                  motor = Image.asset("images/motor.png");
                  ruedas = Image.asset("images/mejoraRuedas.png");
                });
                mostrarLogin(context);
              },
            )
          ],
        ),
        body: Container(
            child: Scaffold(
              backgroundColor: Colors.transparent,
              appBar: AppBar(
                elevation: 0,
                backgroundColor: Colors.transparent,
              ),
              body: Center(
                  child: Stack(children: [
                Column(
                  crossAxisAlignment: CrossAxisAlignment.center,
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Container(
                      child: SizedBox(
                        height: 40,
                        child: Text(
                          listCoches[cocheActual].nombre,
                          style: TextStyle(
                              fontFamily: "Castellar",
                              fontSize: 35,
                              color: listCoches[cocheActual].colorCoche,
                              fontWeight: FontWeight.bold),
                        ),
                      ),
                    ),

                    SizedBox(
                      height: 40,
                    ),

                    TransparentImageButton.assets(
                      listCoches[cocheActual].rutaImagen,
                      width: 400,
                      opacityThreshold: 0.8,
                      onTapInside: () => {
                        contDinero =
                            sumarPuntos(contDinero, listCoches, cocheActual),
                        estado(),
                        setState(() {
                          if (contDinero >=
                                  listCoches[cocheActual].precioMejoraMotor *
                                      1.5 &&
                              contMejoraCoches >= 3) {
                          }
                        }),
                      },
                    ),
                    SizedBox(
                      height: 40,
                    ),

                    Container(
                      child: Text(
                        "Has derrapado: " + contDinero.toString() + " veces",
                        style: TextStyle(
                            fontFamily: "Castellar",
                            fontSize: 25,
                            color: listCoches[cocheActual].colorCoche,
                            fontWeight: FontWeight.bold),
                      ),
                    ),

                    //spacer te lo lleva al final de la paginal al noponer nada dentro
                    Spacer(),

                    SizedBox(
                      child: Footer(
                          child: Column(children: [
                        Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              //boton 1 mejorar ruedas

                              IconButton(
                                iconSize: 150,
                                splashColor: Colors.red,
                                splashRadius: 30,
                                onPressed: () {
                                  setState(() {
                                    if (contDinero >=
                                            listCoches[cocheActual]
                                                .precioMejoraRuedas &&
                                        nivelRuedasActive) {
                                          listCoches[cocheActual].nivelRuedas++;
                                      contMejoraCoches++;
                                      if (contMejoraCoches > 2) {
                                        comprobarMejoraCoches();
                                        btnLvlUp = true;
                                      }
                                      comprar(
                                          contDinero, listCoches, cocheActual);
                                      contDinero = contDinero -
                                          listCoches[cocheActual]
                                              .precioMejoraRuedas;
                                      nivelRuedasActive = false;
                                      contMejoras++;

                                      ruedas = Image.asset(
                                          "images/mejoraRuedas.png",
                                          opacity:
                                              const AlwaysStoppedAnimation(.4));
                                      //selection
                                    } else if (contDinero <
                                        listCoches[cocheActual]
                                            .precioMejoraRuedas) {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "No has derrapado lo sufuciente, sigue drifteando :)"),
                                      ));
                                    } else {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "Ya has comprado el las ruedas"),
                                      ));
                                    }
                                  });
                                },
                                icon: ruedas,
                              ),

                              //boton 2 turbo
                              IconButton(
                                iconSize: 110,
                                splashColor: Colors.red,
                                splashRadius: 30,
                                icon: turbo,
                                onPressed: () {
                                  setState(() {
                                   
                                    if (contDinero >=
                                            listCoches[cocheActual]
                                                .precioMejoraTurbo &&
                                        nivelTurboActive) {
                                          listCoches[cocheActual].nivelRuedas++;
                                      contMejoraCoches++;
                                      if (contMejoraCoches > 2) {
                                        comprobarMejoraCoches();
                                        btnLvlUp = true;
                                      }
                                      comprar(
                                          contDinero, listCoches, cocheActual);
                                      contDinero = contDinero -
                                          listCoches[cocheActual]
                                              .precioMejoraTurbo;
                                      nivelTurboActive = false;
                                      contMejoras++;

                                      turbo = Image.asset("images/turbo.png",
                                          opacity:
                                              const AlwaysStoppedAnimation(.4));

                                      //selection
                                    } else if (contDinero <
                                        listCoches[cocheActual]
                                            .precioMejoraTurbo) {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "No has derrapado lo sufuciente, sigue drifteando :)"),
                                      ));
                                    } else {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "Ya has comprado el turbo Stutututu"),
                                      ));
                                    }
                                  });
                                },
                              ),

                              //boton 3

                              IconButton(
                                iconSize: 150,
                                splashColor: Colors.red,
                                splashRadius: 30,
                                onPressed: () {
                                  setState(() {
                                    if (contDinero >=
                                            listCoches[cocheActual]
                                                .precioMejoraMotor &&
                                        nivelMotorActive) {
                                          listCoches[cocheActual].nivelRuedas++;
                                      contMejoraCoches++;

                                      if (contMejoraCoches > 2) {
                                        comprobarMejoraCoches();
                                        btnLvlUp = true;
                                      }
                                      comprar(
                                          contDinero, listCoches, cocheActual);
                                      contDinero = contDinero -
                                          listCoches[cocheActual]
                                              .precioMejoraMotor;
                                      nivelMotorActive = false;
                                      contMejoras++;

                                      motor = Image.asset("images/motor.png",
                                          opacity:
                                              const AlwaysStoppedAnimation(.4));

                                      //selection
                                    } else if (contDinero <
                                        listCoches[cocheActual]
                                            .precioMejoraMotor) {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "No has derrapado lo sufuciente, sigue drifteando :)"),
                                      ));
                                    } else {
                                      ScaffoldMessenger.of(context)
                                          .showSnackBar(SnackBar(
                                        content: Text(
                                            "Ya has comprado el turbo Stutututu"),
                                      ));
                                    }
                                  });
                                },
                                icon: motor,
                              )
                            ]),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                          children: [
                            Text(
                                style: TextStyle(
                                    fontFamily: "Castellar",
                                    fontSize: 25,
                                    color: listCoches[cocheActual].colorCoche,
                                    fontWeight: FontWeight.bold),
                                listCoches[cocheActual]
                                        .precioMejoraRuedas
                                        .toString() +
                                    "€"),
                            Text(
                                style: TextStyle(
                                    fontFamily: "Castellar",
                                    fontSize: 25,
                                    color: listCoches[cocheActual].colorCoche,
                                    fontWeight: FontWeight.bold),
                                listCoches[cocheActual]
                                        .precioMejoraTurbo
                                        .toString() +
                                    "€"),
                            Text(
                                style: TextStyle(
                                    fontFamily: "Castellar",
                                    fontSize: 25,
                                    color: listCoches[cocheActual].colorCoche,
                                    fontWeight: FontWeight.bold),
                                listCoches[cocheActual]
                                        .precioMejoraMotor
                                        .toString() +
                                    "€"),
                          ],
                        )
                      ])),
                      height: 300,
                    )
                  ],
                ),

                //BOTON ALEATORIO
                Visibility(
                    visible: btnVisible,
                    child: Positioned(
                      top: y,
                      left: x,
                      child: IconButton(
                        splashRadius: 1,
                        icon: Image.asset("images/nitro.png"),
                        iconSize: 100,
                        onPressed: () {
                          setState(() {
                            btnVisible = false;
                          });
                          incrementarBtndinamico(cocheActual);
                        },
                      ),
                    )),

                //BOTON DE MEJORA DE COCHES
                Visibility(
                    visible: btnLvlUp,
                    child: Positioned(
                      top: MediaQuery.of(context).size.height / 1.37,
                      left: MediaQuery.of(context).size.width / 4,
                      width: 300,
                      child: IconButton(
                        splashRadius: 1,
                        icon: imagenMejoraCoches,
                        iconSize: 100,
                        onPressed: () {
                          setState(() {
                            if (contDinero >=
                                listCoches[cocheActual].precioMejoraMotor *
                                    1.5) {

                                      contDinero = contDinero - precioMejoraLvlUp.toInt();

                              btnLvlUp = false;
                              cocheActual++;

                              //reseteo de los demas botones de mejoras
                              turbo = Image.asset("images/turbo.png");
                              motor = Image.asset("images/motor.png");
                              ruedas = Image.asset("images/mejoraRuedas.png");

                              nivelMotorActive = true;
                              nivelTurboActive = true;
                              nivelRuedasActive = true;

                              contMejoraCoches = 0;
                            } else {
                              ScaffoldMessenger.of(context)
                                  .showSnackBar(SnackBar(
                                content: Text(
                                    "No has derrapado lo sufuciente, necesitas " + precioMejoraLvlUp.toString() + " derrapes",
                              )));
                            }
                          });
                        },
                      ),
                    )),
              ])),
            ),
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage("images/fondoJuego.png"),
                fit: BoxFit.cover,
              ),
            )));
  }

  void estado() {
    setState(() {});
  }
}

void comprobarMejoraCoches() {
  if (contDinero >= listCoches[cocheActual].precioMejoraMotor * 1.5) {
    imagenMejoraCoches = Image.asset("images/lvlUp.png",
        opacity: const AlwaysStoppedAnimation(1));
  }else{
        imagenMejoraCoches = Image.asset("images/lvlUp.png",
        opacity: const AlwaysStoppedAnimation(.4));
  }
}

//suma de puntos en cada click al coche correspondiente
int sumarPuntos(int cont, List<Coche> coches, int cocheActual) {
  cont = cont +
      coches[cocheActual].multiplicador +
      coches[cocheActual].nivelRuedas;

  return cont;
}

int comprar(int cont, List<Coche> coches, int cocheActual) {
  coches[cocheActual].nivelRuedas++;

  return cont;
}

void mostrarLogin(BuildContext context) {
  Navigator.of(context).pushNamed("/login");
}

void incrementarBtndinamico(int cocheActual) {
  switch (cocheActual) {
    case 0:
      contDinero = contDinero + 250;
      break;
    case 1:
      contDinero = contDinero + 350;
      break;
    case 2:
      contDinero = contDinero + 700;
      break;
    case 3:
      contDinero = contDinero + 1500;
      break;
    case 4:
      contDinero = contDinero + 2800;
      break;
  }
}

//dejar los datos a 0 parar resetear la partida
void reset() {
  contDinero = 0;
  cocheActual = 0;

  datos.pass = "";
  datos.usuario = "";
}

List<Coche> ArrayCoches() {
  List<Coche> coches = [];

  coches.add(Coche(
    nombre: "Porsche 911",
    multiplicador: 1,
    rutaImagen: "images/primero.png",
    colorCoche: Color.fromARGB(255, 108, 97, 166),
    precioMejoraMotor: 250,
    precioMejoraRuedas: 25,
    precioMejoraTurbo: 100,
  ));
  coches.add(Coche(
    nombre: "Honda Ek9 TypeR",
    multiplicador: 2,
    rutaImagen: "images/segundo.png",
    colorCoche: Color.fromARGB(255, 95, 99, 102),
    precioMejoraMotor: 500,
    precioMejoraRuedas: 50,
    precioMejoraTurbo: 200,
  ));
  coches.add(Coche(
    nombre: "Toyota Supra Mk4",
    multiplicador: 4,
    rutaImagen: "images/tercero.png",
    colorCoche: Color.fromARGB(255, 42, 42, 44),
    precioMejoraMotor: 900,
    precioMejoraRuedas: 100,
    precioMejoraTurbo: 400,
  ));
  coches.add(Coche(
    nombre: "Nissan Skyline R34",
    multiplicador: 8,
    rutaImagen: "images/cuarto.png",
    colorCoche: Color.fromARGB(255, 12, 86, 209),
    precioMejoraMotor: 1800,
    precioMejoraRuedas: 180,
    precioMejoraTurbo: 650,
  ));
  coches.add(Coche(
    nombre: "Mazda RX-7",
    multiplicador: 15,
    rutaImagen: "images/quinto.png",
    colorCoche: Color.fromARGB(255, 243, 66, 24),
    precioMejoraMotor: 3500,
    precioMejoraRuedas: 350,
    precioMejoraTurbo: 1350,
  ));

  return coches;
}









//HECHO COMPLETAMENTE POR MANGIMAN