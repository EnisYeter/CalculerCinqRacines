//tracage du dossier dans lequel ce trouve ce fichier.
package com.enishan;
//signifie qu'on importe une class pour utiliser ses fonctionnalites, celle-ci est pour la fonction Scanner que nous utiliserons en objet dans une variable.
import java.util.*;
//Definition de la class actuelle.
public class CalculerCinqRacines
{
    public static void main(String[] args)
    {
        System.out.println("Bonjour, grace à ce programme, nous allons calculer 5 fois la racine de nombres que vous choisirez !");
        final int NFOIS = 5; //Declaration et assignation d'une variable à valeur fixe
        int c; //Declaration d'une variable pour les conditions de la boucle for
        double x; //Declaration d'une variable pour le nombre saisi par l'utilisateur afin de calculer sa racine
        double racx; //Declaration de la variable pour le resultat de la racine carree
        Scanner lectureClavier = new Scanner(System.in); //Declaration pour la variable representant la lecture au clavier
        System.out.println("Bonjour !");
        System.out.println("Je vais vous calculer " + NFOIS + " racines carrees");
        /*
        Voici une boucle, entre parenthese, c = 0, elle declare une instruction qui est realisee AVANT le travail de la boucle.
        c < 5, declare la condition : tant que c est plus petit que 5, on repete a nouveau la boucle.
        c++, signifie c=c+1, cela signifie qu'a la fin de chaque boucle, on ajoute une valeur +1 a c
        */
        for (c = 0; c < 5; c++)
        {
        System.out.println ("Veuillez saisir la valeur pour laquelle vous cherchez la racine :");
        x = lectureClavier.nextDouble(); // Lecture de la saisie de l'utilisateur et assigne la valeur a la variable x
            if (x < 0.0) //la condition est entre parenthese, pas de racine pour les nombres negatifs
                System.out.println (x + " ne possède pas de racine carrée"); //Instruction a realiser dans ce cas
            else
            {
                racx = Math.sqrt(x);
                System.out.println (x + " a pour racine carrée : " + racx);
            }
        }
        System.out.println ("Merci, le travail est terminé !");
    }
}