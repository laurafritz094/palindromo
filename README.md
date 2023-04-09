# palindromo
ejercicios clases poo, indentificar palindromo y test unitarios

que hace el metodo? 
el metodo recibe un string, genera un resulta con el string revertido y los compara, el retorno es un boolean true si el string de input y el string generado son iguales
como lo hace? 
con los metodos split reverse y join 
como lo uso ?
split separa cada vez que encuentra lo que lleva entre parentesis, en este caso("") no hay nada en medio entonces separa en cada caracter en un arreglo 
reverse, genera el arreglo invertido 
y join junta el arreglo generado en un nuevo string 

un ejemplo de su uso seria 

function esPalindromo("anilina") {
let resultado = "";
resultado =("anilina");
return cadena === resultado;
}
en este caso retorna true;

que puede salir mal ? plan de pruebas, 5 casos de prueba, ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?

-la ejecucion solo se realiza una vez, asi que es tedocio tener que recargar el aplicativo para volver a consultar.
-solo admite palabras, en caso de que ingresen una frase "Sometamos o matemos" no reconoce que puedan ser iguales
casos criticos de prueba: 
-"a" - "Sometamos o matemos" - "casa" - " " - "jasjndjnajads"
“aca” resultado es pálindromo , “acas” no es palindromo , “h” resultado: si es palindromo
- al ingresar " " como caso de prueba en los test se cae la aplicacion, agregare esa validacion para tal caso.
- como a las frases que podrian ser un palindromo no las reconoce, para entregar una respuesta valida validaremos que solo ingrese palabras.

conclusion:
el aplicattions run no me permite analizar los casos criticos ya que por default no deja ingresar casos vacios, y el input solo reconoce la primera palabra al agregar una frase.
con la ayuda de los test puedo probar estos casos criticos y tomar esos casos como un error controlado en la logica, 
en el ultimo commit se  agrega para mejorar el codigo: 
-un boolean para las repiticiones de ejecucion
-validacion de que sea una palabra y nos frases
-validacion de que el input no sea vacio


