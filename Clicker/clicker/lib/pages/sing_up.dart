import 'package:audioplayers/audioplayers.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class datos {
  static String usuario = "";
  static final usuarioEditingController = TextEditingController();

  static String pass = "";
  static final passEditingController = TextEditingController();
}

class claseRegistro extends StatefulWidget {
  @override
  InterfazRegistro createState() => InterfazRegistro();
}

class InterfazRegistro extends State<claseRegistro> {

  final player = AudioPlayer();

void playFile(String url) {
  player.play(AssetSource(url));
}
  @override
  Widget build(BuildContext context) {

    String usuario = "";
    String correo = "";
    String pass = "";

    // TODO: implement build
    return Scaffold(
      body: Container(
        child: Scaffold(
            backgroundColor: Colors.transparent,
            appBar: AppBar(
              automaticallyImplyLeading: false,
              elevation: 0,
              backgroundColor: Colors.transparent,
            ),
            body: Center(
              child: Column(
                children: [
                  SizedBox(height: 170),
                  SizedBox(
                    height: 50,
                    width: 250,
                    child:
                    
                     TextField(
                      maxLength: 25,
                        style: TextStyle(
                            color: Color.fromARGB(255, 149, 201, 243)),
                        onChanged: (text) {
                        },
                        decoration: InputDecoration(
                            hintText: "   Correo electronico",
                            hintStyle: TextStyle(
                                color: Color.fromARGB(255, 149, 201, 243),
                                fontStyle: FontStyle.italic),

                            //Enabled es cuando el textfield NO esta seleccionado, no es algo solo del textfield
                            enabledBorder: OutlineInputBorder(
                                borderRadius: const BorderRadius.all(
                                    const Radius.circular(30)),
                                borderSide: BorderSide(
                                    width: 2,
                                    color: Color.fromARGB(255, 56, 57, 59))),
                            //Focused es cuando el textfield SI esta seleccionado, no es algo solo del textfield
                            focusedBorder: OutlineInputBorder(
                                borderRadius: const BorderRadius.all(
                                    const Radius.circular(30)),
                                borderSide: BorderSide(
                                    width: 2,
                                    color: Color.fromARGB(255, 56, 57, 59))))),
                  ),
                  SizedBox(height: 20),
                  SizedBox(
                    height: 50,
                    width: 250,
                    child:
                    
                     TextField(
                        style: TextStyle(
                            color: Color.fromARGB(255, 149, 201, 243)),
                        controller: datos.usuarioEditingController,
                        onChanged: (text) {
                          this.setState(() {
                            datos.usuario = text;
                          });
                        },
                        decoration: InputDecoration(
                            hintText: "   Nombre de usuario",
                            hintStyle: TextStyle(
                                color: Color.fromARGB(255, 149, 201, 243),
                                fontStyle: FontStyle.italic),

                            //Enabled es cuando el textfield NO esta seleccionado, no es algo solo del textfield
                            enabledBorder: OutlineInputBorder(
                                borderRadius: const BorderRadius.all(
                                    const Radius.circular(30)),
                                borderSide: BorderSide(
                                    width: 2,
                                    color: Color.fromARGB(255, 56, 57, 59))),
                            //Focused es cuando el textfield SI esta seleccionado, no es algo solo del textfield
                            focusedBorder: OutlineInputBorder(
                                borderRadius: const BorderRadius.all(
                                    const Radius.circular(30)),
                                borderSide: BorderSide(
                                    width: 2,
                                    color: Color.fromARGB(255, 56, 57, 59))))),
                  ),
                  SizedBox(height: 20),
                  SizedBox(
                    height: 50,
                    width: 250,
                    child: TextField(
                      style:
                          TextStyle(color: Color.fromARGB(255, 149, 201, 243)),
                      controller: datos.passEditingController,
                      onChanged: (text) {
                        this.setState(() {
                          datos.pass = text;
                        });
                      },
                      decoration: InputDecoration(
                          hintText: "   Contraseña",
                          hintStyle: TextStyle(
                            color: Color.fromARGB(255, 149, 201, 243),
                            fontStyle: FontStyle.italic,
                          ),
                          enabledBorder: OutlineInputBorder(
                              borderRadius: const BorderRadius.all(
                                  const Radius.circular(30)),
                              borderSide: BorderSide(
                                  width: 2,
                                  color: Color.fromARGB(255, 56, 57, 59))),
                          focusedBorder: OutlineInputBorder(
                              borderRadius: const BorderRadius.all(
                                  const Radius.circular(30)),
                              borderSide: BorderSide(
                                  width: 2,
                                  color: Color.fromARGB(255, 56, 57, 59)))),
                    ),
                  ),
                  SizedBox(
                    height: 20,
                  ),
                  TextButton(
                    style: ButtonStyle(
                        foregroundColor: MaterialStateProperty.all<Color>(
                            Color.fromARGB(255, 149, 201, 243)),
                        padding: MaterialStateProperty.all<EdgeInsets>(
                            EdgeInsets.fromLTRB(20, 20, 20, 20)),
                        shape:
                            MaterialStateProperty.all<RoundedRectangleBorder>(
                                RoundedRectangleBorder(
                                    borderRadius: BorderRadius.circular(20),
                                    side: BorderSide(
                                        width: 2,
                                        color:
                                            Color.fromARGB(255, 56, 57, 59))))),
                    onPressed: () {
                      mostrarJuego(context);
                    },
                    child: Text(
                      'Continuar',
                      style: TextStyle(fontWeight: FontWeight.bold),
                    ),
                  )
                ],
              ),
            )),
        decoration: BoxDecoration(
            image: DecorationImage(
          image: AssetImage("images/fondo.png"),
          fit: BoxFit.cover,
        )),
      ),
    );
  }

  void mostrarJuego(BuildContext context) {
    Navigator.of(context).pushNamed("/login");
  }
}
