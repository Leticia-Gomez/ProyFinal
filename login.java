  public static void contra() {
    //Registro de usuarios
    int numUsers;
    int i;
    int passw[]= {000,000,000,000,000,};
    String users[]= {"Sin datos","Sin datos","Sin datos","Sin datos","Sin datos"};
    int tempP;//Contrase�a temporal para evaluar con el array
    String tempU;//Usuario temporal para evaluar con el array
    int tries=1;//Contador de intentos

    System.out.println("Cu�ntos usuarios deseas registrar?");
    numUsers=s.nextInt();
    for(i=1;i<=numUsers;i++) {
        System.out.println("Ingresa el nombre del usuario "+i);
        users[i]=s.next();
        System.out.println("Ingresa la contrase�a del usuario "+users[i]);
        passw[i]=s.nextInt();
        System.out.println("Usuario registrado con �xito!");
    }
    //Autenticaci�n de los usuarios
    do {
        for(i=1;i<=numUsers;i++){
            System.out.println("Ingresa el nombre del usuario");
            tempU=s.next();
            if(tempU.equals(users[i])) {
                System.out.println("Ingresa la contrase�a del usuario "+tempU);
                tempP=s.nextInt();
                if(tempP==passw[i]) { 
                    System.out.println("Acceso concedido!");
                    
                }
                else {
                    System.out.println("Contrase�a incorrecta");
                    tries++;
                    continue;
                }
            }
            else {
                System.out.println("Usuario incorrecto");
                tries++;
                continue;
            }
    continue;
    }
break;
}while(tries<=5);//Despu�s de 5 intentos el programa se detiene

}