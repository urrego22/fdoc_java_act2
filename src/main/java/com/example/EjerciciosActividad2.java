package com.example;

public class EjerciciosActividad2 {
    public static void main(String[] args) {
        // --- While ---       
        // Este ejercicio usa un ciclo while para imprimir los números del 1 al 10. Cada iteración valida que la variable no supere el límite antes de continuar.
        // TODO: Implementación en main
        int i = 1;
        while (i <= 10) {
        System.out.println(i);
        i++;
        }

        // Este ejercicio utiliza un ciclo while para sumar los números desde 1 hasta n y luego muestra la suma total acumulada.
        // --- While 2: suma 1 a n ---
        int n = 7; 
        int suma = 0;
        int j = 1;
        while (j <= n) {
        suma += j;
        j++;
        }
        System.out.println("Suma hasta " + n + ": " + suma);

        // Este ejercicio recorre un arreglo con while para buscar un número específico y se detiene inmediatamente cuando lo encuentra usando break.
        // --- While 3: buscar numero en arreglo ---
        int[] nums = {2, 5, 8, 10};
        int buscado = 8;
        int k = 0;
        boolean encontrado = false;
        while (k < nums.length) {
         if (nums[k] == buscado) {
            encontrado = true;
            break;
         }
         k++;
        }
        System.out.println("Encontrado: " + encontrado);

        // --- Do-while ---       
        // TODO: Implementación en mainb
        // Este ejercicio muestra un menú interactivo con do-while. El menú aparece al menos una vez y el ciclo termina cuando el usuario selecciona 'Salir'.
        // --- Do-while 1: menú básico ---
        int opcion;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("1. Opción A\n2. Opción B\n3. Salir");
            opcion = sc.nextInt();
        } while (opcion != 3);

        // Este ejercicio lee números con do-while y los suma hasta que el usuario ingresa 0. Después, muestra el total acumulado.
        // --- Do-while 2: leer hasta 0 y sumar ---
        int num;
        int total = 0;
        do {
            System.out.print("Ingrese número (0 para salir): ");
            num = sc.nextInt();
            total += num;
        } while (num != 0);
        System.out.println("Total: " + total);

        

        // Este ejercicio solicita una contraseña usando do-while. El ciclo se repite hasta que el usuario ingrese la clave correcta.
        // --- Do-while 3: validar contraseña ---
        String clave;
        do {
            System.out.print("Ingrese clave: ");
            clave = sc.next();
        } while (!clave.equals("1234"));
        System.out.println("Acceso concedido");

        // --- For ---       
        // TODO: Implementación en main
        // Este ejercicio usa un ciclo for para imprimir únicamente los números pares del 2 al 20 incrementando de dos en dos.
        // --- For 1: pares 2 a 20 ---
        for (int x = 2; x <= 20; x += 2) {
            System.out.println(x);
        }

        // Este ejercicio calcula el factorial de un número usando un ciclo for, multiplicando cada número hasta el valor ingresado.
        // --- For 2: factorial ---
        int numF = 5;
        long fact = 1;
        for (int a = 1; a <= numF; a++) {
            fact *= a;
        }
        System.out.println("Factorial de " + numF + ": " + fact);

        // Este ejercicio recorre un arreglo con un ciclo for sumando cada elemento para obtener el total.
        // --- For 3: suma arreglo ---
        int[] arr = {1, 2, 3, 4};
        int sumArr = 0;
        for (int x = 0; x < arr.length; x++) {
            sumArr += arr[x];
        }
        System.out.println("Suma arreglo: " + sumArr);

        // --- For-each ---       
        // TODO: Implementación en main
        // Este ejercicio utiliza un ciclo for-each para recorrer un arreglo de enteros y sumar sus valores.
        // --- For-each 1: sumar ---
        int[] datos = {3, 6, 9};
        int sumaFE = 0;
        for (int v : datos) {
            sumaFE += v;
        }
        System.out.println("Suma for-each: " + sumaFE);

        // Este ejercicio recorre un arreglo de cadenas con un for-each e imprime cada palabra en consola.
        // --- For-each 2: listar palabras ---
        String[] palabras = {"Hola", "Java", "Bucles"};
        for (String p : palabras) {
            System.out.println(p);
        }

        // Este ejercicio suma calificaciones en un arreglo usando for-each y calcula el promedio con dos decimales.
        // --- For-each 3: promedio ---
        double[] notas = {4.0, 3.5, 5.0};
        double sNotas = 0;
        for (double n2 : notas) {
            sNotas += n2;
        }
        System.out.printf("Promedio: %.2f\n", sNotas / notas.length);

        // --- Break y Continue ---       
        // TODO: Implementación en main
        // Este ejercicio usa break dentro de un ciclo for para detener la ejecución cuando se cumple una condición específica.
        // --- Break ---
        for (int t = 1; t <= 10; t++) {
            if (t == 5) break;
            System.out.println("t: " + t);
        }

        // Este ejercicio usa continue dentro de un ciclo for para saltar iteraciones que cumplen una condición y continuar con la siguiente.
        // --- Continue ---
        for (int t = 1; t <= 5; t++) {
            if (t == 3) continue;
            System.out.println("t2: " + t);
        }

        // Este ejercicio combina break y continue en un ciclo para omitir ciertos valores y detener el ciclo al alcanzar un número límite.
        // --- Break + Continue ---
        for (int t = 1; t <= 10; t++) {
            if (t % 2 == 0) continue;
            if (t == 9) break;
            System.out.println("t3: " + t);
             }
            }
         }

        // Sugerencia: copie y adapte el bloque anterior por cada ejercicio de las secciones de bucles.
        // Recomendaciones generales
        // - Ejecute y valide cada ejercicio de forma independiente.
        // - Si la salida interfiere entre ejercicios, comente temporalmente los anteriores.
        // - Mantenga coherencia en mensajes y formato de salida.
  