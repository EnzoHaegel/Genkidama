package fr.icenore.genkidama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Game extends AppCompatActivity {

    private TextView print_ask;
    private LinearLayout screen;
    Random rand = new Random();
    int nbQuestions = 0;

    public static String[] removeX(String arr[], int x)
    {
        int i;
        int j = 0;
        String[] newArray = new String[arr.length - 1];
        for (i = 0; i < arr.length; i++) {
            if (i != x) {
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        nbQuestions++;
        String [] name = Menu.getName();
        this.screen = (LinearLayout) findViewById(R.id.screen);
        this.print_ask = (TextView) findViewById(R.id.question);
        if (name.length <= 1) {
            print_ask.setText("Rajoutez des noms de joueurs pour pouvoir jouer !");
            screen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });}
        else {
            String[] hot = {
                    "name embrasse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 8 gorgées !", //1.2
                    "name embrasse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 8 gorgées !",
                    "name embrasse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 8 gorgées !",
                    "name embrasse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 8 gorgées !",
                    "name embrasse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 8 gorgées !",
                    " "
            };
            final String[][] questions = {{
                    "name est la cible du genkidama, il boit 1 gorgée pour chaque bras levés qui font un genkidama.", // 1.0
                    "name est la cible du genkidama, il boit 1 gorgée pour chaque bras levés qui font un genkidama.",
                    "name est la cible du genkidama, il boit 1 gorgée pour chaque bras levés qui font un genkidama.",
                    "name est la cible du genkidama, il boit 1 gorgée pour chaque bras levés qui font un genkidama.",
                    "name est la cible du genkidama, il boit 1 gorgée pour chaque bras levés qui font un genkidama.",
                    "name, tire une carte, si c'est un rouge, il distribue hauteur carte, sinon il les boit.",
                    "name à 30 secondes pour se cacher, le premier qui le trouve distribue un cul sec.",
                    "name, chante une chanson, le premier qui trouve ce que c'est distribue 6 gorgées.",
                    "name, raconte une anecdote vrai ou fausse, si personne trouve ou tout le monde, il boit 4 gorgées, sinon tous ceux qui ont faux boivent 2.",
                    "name est une pute.",
                    "name et " + name[rand.nextInt(name.length - 1) + 1] + " sont partenaires, ils se partagent les gorgées jusqu'à la fin de la partie.",
                    "name, fait un shifumi contre " + name[rand.nextInt(name.length - 1) + 1] + ", le perdant boit 2 gorgées.",
                    "name doit boire de la main gauche jusqu'à la fin de la partie, sinon 2 gorgées par fautes.",
                    "name, mange la première chose que tu vois dans le frigo, sinon 4 gorgées.",
                    "name, tourne 10 tours sur toi même, si tu tombe, 4 gorgées pour t'achever !",
                    "name doit faire une blague, si c'est pas drôle 2 gorgées.",
                    "name, non vraiment j'ai pas d'idée la, trouvez lui un gage.",
                    "name est un chien, donnez lui à manger !",
                    "name, allonge toi sur le sol, " + name[rand.nextInt(name.length - 1) + 1] + " assis toi sur lui et boit 6 gorgées",
                    "name, remplit le verre de ce que tu veux, de tous ceux qui n'ont pas encore bu dans leur verre.",
                    "name, boit un shot avec un sucre !",
                    "name est le nouveau maître du jeu, vénérez le ou 2 gorgées !",
                    "name, caresse ton voisin de gauche.",
                    "name, fait le ver de terre.",
                    "name, boit un shot, si tu a une expression faciale, reprend en un autre !",
                    "name, aller va vomir on te sent pas bien !",
                    "name, c'est avec un grand sourire que tu te prend 2 gorgées",
                    "name, cite 5 pays d'Afrique, 1 gorgée par pays manquant !",
                    "name, cite 5 pays d'Asie, 1 gorgée par pays manquant !",
                    "name, cite 5 pays d'Amérique du sud, 1 gorgée par pays manquant !",
                    "name, broute de l'herbe.",
                    "name, parle uniquement en anglais jusqu'à la fin de la partie.",
                    "name, si quelqu'un à une place moins confortable que la tienne, prend sa place.",
                    "name, un petit coup de water te fera du bien!",
                    "name, dit quelque chose que n'a jamais fait, si tout le monde l'a fait ou personne tu bois 4 gorgées, sinon ceux qui l'ont fait doivent boire 2 gorgées.",
                    "name commence, à tour de rôle citez un pays d'Asie, la première personne qui répète un pays ou qui n'a plus d'idée, bois le nombre de pays qui ont été cités.",
                    "name commence, à tour de rôle citez un nom de site porno, la première personne qui répète un site ou qui n'a plus d'idée, bois le nombre de sites qui ont été cités.",
                    "name commence, à tour de rôle citez un pays d'Afrique, la première personne qui répète un pays ou qui n'a plus d'idée, bois le nombre de pays qui ont été cités.",
                    "name, donne le nom de la personne la plus bg à cette soirée, cette personne distribue 2 gorgées.",
                    "name, lis à voix haute ton dernier sms, ou boit 2 gorgées.",
                    "name, bois sans les mains 2 gorgées !",
                    "name, fais un court poème sur ton verre. S'il est jugé nul, bois 2 gorgées !",
                    "name, fais le bruit d'un koala qui jouit. (Kreeeoooooggg)",
                    "name, enlève un vêtement de ton choix ou bois 4 gorgées",
                    "name, désigne la personne la plus gentil ici, et vous buvez tous les deux 2 gorgées.",
                    "name est le tricheur, il peut tricher sur ses gorgées, mais s'il se fait prendre il en prend double !",
                    "name, quelle est la capitale du Brésil ?\n Si tu n'a pas la réponse, 2 gorgées !\n(réponse: Brasília)",
                    "name, combien font 5 + (4 x 2) ?\n Si tu n'a pas la réponse, 2 gorgées !",
                    "name juge qui fait le mieux le bruit de voiture, celui qui le fais le mieux distribue 4 gorgées.",
                    "name juge qui a le moins bu, celui ci doit rattraper son retard et boit 4 gorgées",
                    "name juge qui a les pires gouts vestimentaires, il boit 2 gorgées",
                    "name, tu peux annuler jusqu'à 3 gorgées futurs !",
                    "name est un dieu, donnez lui des offrandes, il reçoit 1 gorgée de chaque personnes !",
                    "name est trop pipou, il parle le langage des chats à partir de maintenant!",
                    "name fais 10 pompes, ou bois 4 gorgées !",                                                                                                         // 1.1
                    "name porte en princesse " + name[rand.nextInt(name.length - 1) + 1] + ", ou bois 4 gorgées !",
                    "name est le DJ, il met la musique qu'il veut, si la majorité des autres joueurs n'aime pas, il boit 6 gorgées !",
                    "name désigne la personne qui a les pires goûts musicaux, il boit 3 gorgées pour ses goûts de merde!",
                    "name, si t'arrive à toucher tes deux mains derrière ton dos, une par le haut l'autre par le bas, distribue 6 gorgées, sinon bois les!",
                    "name, distribue 1 gorgée pour chaque capitale de pays que tu peux donner, si tu te trompe, bois les !",                                            // 1.2
                    "name et " + name[rand.nextInt(name.length - 1) + 1] + ", faites un combat de regard, le premier qui cligne des yeux boit 3 gorgées !",
                    "name et " + name[rand.nextInt(name.length - 1) + 1] + ", echangez un vêtement!",
                    "A trois, tout le monde pointe du doigt le joueur qui doit être le meilleur au lit, celui qui a le plus de votes devra boire 3 gorgées!",
                    "A trois, tout le monde pointe du doigt le joueur qui a le meilleur prénom pour devenir une star, celui qui a le plus de votes devra boire 3 gorgées!",
                    "A trois, tout le monde pointe du doigt le joueur qui a le plus soif, celui qui a le plus de votes devra boire 3 gorgées!",
                    "A trois, tout le monde pointe du doigt le joueur qui perdu sa virginité de la manière la plus bizarre, celui qui a le plus de votes devra boire 3 gorgées et raconter!",
                    "A trois, tout le monde pointe du doigt le joueur le plus beau, celui qui a le plus de votes devra boire 3 gorgées!",
                    "Tous ceux qui ont eu un orgasme aujourd'hui boivent 2 gorgées!",
                    "Tous ceux qui sont sur leur téléphone boivent 2 gorgées!",
                    "Toi qui lis ce message boit 8 gorgées!",
                    "Toi qui lis, ne prononce pas cette phrase à voix haute, tu as le droit d'inventer une action ou un gage à quelqu'un, s'il s'en rend compte bois 6 gorgées!",
                    "Le dernier qui touche name bois 4 gorgées!",
                    "Toi qui lis, distribue 8 gorgées!",
                    "Le dernier à toucher du rouge boit 4 gorgées !",
                    "Le dernier à toucher du blanc boit 4 gorgées !",
                    "Le dernier à toucher du rose boit 4 gorgées !",
                    "Le dernier à toucher du marron boit 4 gorgées !",
                    "Le dernier à toucher du bleu boit 4 gorgées !",
                    "Le dernier à toucher du vert boit 4 gorgées !",
                    "Le dernier à toucher sa poitrine boit 4 gorgées !",
                    "name, à chaque fois que quelqu'un répond à une de tes questions, il boit 2 gorgées!",
                    "name, epele le prénom de chaque membre présent dans le jeu, si tu te trompe c'est 6 gorgées !",
                    "name, mime un animal, le premier à trouver ce que c'est distribue 5 gorgées!",
                    "name est maintenant Nekfeu, il doit dire des phrases qui riment quand il parle, 2 gorgées à chaque erreur !",
                    "name à une tête de bite, tout les joueurs peuvent lui dessiner sur le visage une bite !",
                    "name, termine toutes tes phrases par un cris de jouissement, à chaque oubli c'est 2 gorgées!",
                    "name, bois quelque chose fait par les autres joueurs ou termine ton verre!",
                    "name, crie le premier mot qui te vient à la tête.",
                    "name assis toi sur les genoux de " + name[rand.nextInt(name.length - 1) + 1] + "!",
                    "name est un petit chat, allonge toi sur les genoux de la personne à ta gauche!",
                    "name, prend ton meilleur selfie avec ton voisin de droite!",
                    "name, lis ton dernier message à voix hautes ou bois 4 gorgées!",
                    "Tout le monde peut tricher sur ses gorgées, mais si il se fait prendre par name le policier, il prend double !",
                    "name est beau!"
            }};

            String ranPeople = name[rand.nextInt(name.length - 1) + 1];
            int ranQuestions = rand.nextInt(questions[0].length - 1);
            String ranAsk = questions[0][ranQuestions];
            questions[0] = removeX(questions[0], ranQuestions);
            if (name.length > 2) {
                while (ranAsk.contains(ranPeople)) {
                    ranPeople = name[rand.nextInt(name.length - 1) + 1];
                }
            }
            if (ranAsk.contains("name"))
                ranAsk = ranAsk.replaceAll("name",ranPeople);
            print_ask.setText(ranAsk);
            screen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nbQuestions++;
                    if (nbQuestions == 20 || name.length <= 1) {
                        finish();
                    }
                    String ranPeople = name[rand.nextInt(name.length - 1) + 1];
                    int ranQuestions = rand.nextInt(questions[0].length - 1);
                    String ranAsk = questions[0][ranQuestions];
                    questions[0] = removeX(questions[0], ranQuestions);
                    if (name.length > 2) {
                        while (ranAsk.contains(ranPeople)) {
                            ranPeople = name[rand.nextInt(name.length - 1) + 1];
                        }
                    }
                    if (ranAsk.contains("name"))
                        ranAsk = ranAsk.replaceAll("name",ranPeople);
                    print_ask.setText(ranAsk);
                }
            });
        }
    }
}