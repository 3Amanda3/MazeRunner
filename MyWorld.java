import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 20, 40); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * @param no parameters
     * @return nothing is returned
     */
    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,0,19);
        Wall wall2 = new Wall();
        addObject(wall2,0,18);
        Wall wall3 = new Wall();
        addObject(wall3,0,16);
        Wall wall4 = new Wall();
        addObject(wall4,0,17);
        Wall wall5 = new Wall();
        addObject(wall5,0,0);
        Wall wall6 = new Wall();
        addObject(wall6,1,0);
        Wall wall7 = new Wall();
        addObject(wall7,2,0);
        Wall wall8 = new Wall();
        addObject(wall8,4,0);
        Wall wall9 = new Wall();
        addObject(wall9,3,0);
        Wall wall10 = new Wall();
        addObject(wall10,5,0);
        Wall wall11 = new Wall();
        addObject(wall11,7,0);
        Wall wall12 = new Wall();
        addObject(wall12,7,0);
        Wall wall13 = new Wall();
        addObject(wall13,6,0);
        Wall wall14 = new Wall();
        addObject(wall14,8,0);
        Wall wall15 = new Wall();
        addObject(wall15,10,0);
        Wall wall16 = new Wall();
        addObject(wall16,9,0);
        Wall wall17 = new Wall();
        addObject(wall17,11,0);
        Wall wall18 = new Wall();
        addObject(wall18,12,0);
        Wall wall19 = new Wall();
        addObject(wall19,13,0);
        Wall wall20 = new Wall();
        addObject(wall20,14,0);
        Wall wall21 = new Wall();
        addObject(wall21,15,0);
        Wall wall22 = new Wall();
        addObject(wall22,16,0);
        Wall wall23 = new Wall();
        addObject(wall23,17,0);
        Wall wall24 = new Wall();
        addObject(wall24,18,0);
        Wall wall25 = new Wall();
        addObject(wall25,19,0);
        Wall wall26 = new Wall();
        addObject(wall26,19,1);
        Wall wall27 = new Wall();
        addObject(wall27,19,3);
        Wall wall28 = new Wall();
        addObject(wall28,19,2);
        Wall wall29 = new Wall();
        addObject(wall29,19,4);
        Wall wall30 = new Wall();
        addObject(wall30,19,5);
        Wall wall31 = new Wall();
        addObject(wall31,19,6);
        Wall wall32 = new Wall();
        addObject(wall32,19,7);
        Wall wall33 = new Wall();
        addObject(wall33,19,8);
        Wall wall34 = new Wall();
        addObject(wall34,19,9);
        Wall wall35 = new Wall();
        addObject(wall35,19,10);
        Wall wall36 = new Wall();
        addObject(wall36,19,11);
        Wall wall37 = new Wall();
        addObject(wall37,19,13);
        Wall wall38 = new Wall();
        addObject(wall38,19,12);
        Wall wall39 = new Wall();
        addObject(wall39,19,14);
        Wall wall40 = new Wall();
        addObject(wall40,19,15);
        Wall wall41 = new Wall();
        addObject(wall41,19,16);
        Wall wall42 = new Wall();
        addObject(wall42,19,17);
        Wall wall43 = new Wall();
        addObject(wall43,19,18);
        Wall wall44 = new Wall();
        addObject(wall44,19,19);
        Wall wall45 = new Wall();
        addObject(wall45,18,19);
        Wall wall46 = new Wall();
        addObject(wall46,16,19);
        Wall wall47 = new Wall();
        addObject(wall47,16,19);
        Wall wall48 = new Wall();
        addObject(wall48,14,19);
        Wall wall49 = new Wall();
        addObject(wall49,12,19);
        Wall wall50 = new Wall();
        addObject(wall50,10,19);
        Wall wall51 = new Wall();
        addObject(wall51,9,19);
        Wall wall52 = new Wall();
        addObject(wall52,7,19);
        Wall wall53 = new Wall();
        addObject(wall53,5,19);
        Wall wall54 = new Wall();
        addObject(wall54,2,19);
        Wall wall55 = new Wall();
        addObject(wall55,2,19);
        Wall wall56 = new Wall();
        addObject(wall56,1,19);
        Wall wall57 = new Wall();
        addObject(wall57,3,19);
        Wall wall58 = new Wall();
        addObject(wall58,5,19);
        Wall wall59 = new Wall();
        addObject(wall59,4,19);
        Wall wall60 = new Wall();
        addObject(wall60,6,19);
        Wall wall61 = new Wall();
        addObject(wall61,8,19);
        Wall wall62 = new Wall();
        addObject(wall62,11,19);
        Wall wall63 = new Wall();
        addObject(wall63,13,19);
        Wall wall64 = new Wall();
        addObject(wall64,15,19);
        Wall wall65 = new Wall();
        addObject(wall65,17,19);
        Wall wall66 = new Wall();
        addObject(wall66,0,1);
        Wall wall67 = new Wall();
        addObject(wall67,0,2);
        Wall wall68 = new Wall();
        addObject(wall68,0,3);
        Wall wall69 = new Wall();
        addObject(wall69,0,3);
        Wall wall70 = new Wall();
        addObject(wall70,0,4);
        Wall wall71 = new Wall();
        addObject(wall71,0,5);
        Wall wall72 = new Wall();
        addObject(wall72,0,6);
        Wall wall73 = new Wall();
        addObject(wall73,0,7);
        Wall wall74 = new Wall();
        addObject(wall74,0,8);
        Wall wall75 = new Wall();
        addObject(wall75,0,9);
        Wall wall76 = new Wall();
        addObject(wall76,0,10);
        Wall wall77 = new Wall();
        addObject(wall77,0,11);
        Wall wall78 = new Wall();
        addObject(wall78,0,13);
        Wall wall79 = new Wall();
        addObject(wall79,0,14);
        Wall wall80 = new Wall();
        addObject(wall80,0,15);
        Wall wall81 = new Wall();
        addObject(wall81,0,12);
        wall2.setLocation(1,17);
        Wall wall82 = new Wall();
        addObject(wall82,2,17);
        Wall wall83 = new Wall();
        addObject(wall83,3,17);
        Wall wall84 = new Wall();
        addObject(wall84,4,17);
        Wall wall85 = new Wall();
        addObject(wall85,5,17);
        Wall wall86 = new Wall();
        addObject(wall86,7,17);
        Wall wall87 = new Wall();
        addObject(wall87,8,17);
        Wall wall88 = new Wall();
        addObject(wall88,9,17);
        Wall wall89 = new Wall();
        addObject(wall89,11,17);
        Wall wall90 = new Wall();
        addObject(wall90,10,17);
        Wall wall91 = new Wall();
        addObject(wall91,12,17);
        Wall wall92 = new Wall();
        addObject(wall92,13,17);
        Wall wall93 = new Wall();
        addObject(wall93,14,17);
        Wall wall94 = new Wall();
        addObject(wall94,15,17);
        Wall wall95 = new Wall();
        addObject(wall95,16,17);
        Wall wall96 = new Wall();
        addObject(wall96,18,17);
        Wall wall97 = new Wall();
        addObject(wall97,17,17);
        Wall wall98 = new Wall();
        addObject(wall98,17,16);
        wall96.setLocation(17,15);
        Wall wall99 = new Wall();
        addObject(wall99,17,14);
        Wall wall100 = new Wall();
        addObject(wall100,17,13);
        Wall wall101 = new Wall();
        addObject(wall101,17,12);
        Wall wall102 = new Wall();
        addObject(wall102,17,10);
        Wall wall103 = new Wall();
        addObject(wall103,17,8);
        Wall wall104 = new Wall();
        addObject(wall104,17,9);
        Wall wall105 = new Wall();
        addObject(wall105,17,7);
        Wall wall106 = new Wall();
        addObject(wall106,17,6);
        Wall wall107 = new Wall();
        addObject(wall107,17,5);
        Wall wall108 = new Wall();
        addObject(wall108,17,4);
        Wall wall109 = new Wall();
        addObject(wall109,17,2);
        Wall wall110 = new Wall();
        addObject(wall110,17,3);
        Wall wall111 = new Wall();
        addObject(wall111,17,1);
        Wall wall112 = new Wall();
        addObject(wall112,17,1);
        Wall wall113 = new Wall();
        addObject(wall113,16,1);
        Wall wall114 = new Wall();
        addObject(wall114,16,2);
        wall112.setLocation(15,2);
        wall113.setLocation(14,2);
        wall111.setLocation(13,2);
        Wall wall115 = new Wall();
        addObject(wall115,17,1);
        Wall wall116 = new Wall();
        addObject(wall116,11,2);
        Wall wall117 = new Wall();
        addObject(wall117,11,3);
        Wall wall118 = new Wall();
        addObject(wall118,11,4);
        Wall wall119 = new Wall();
        addObject(wall119,12,4);
        Wall wall120 = new Wall();
        addObject(wall120,13,4);
        Wall wall121 = new Wall();
        addObject(wall121,14,4);
        Wall wall122 = new Wall();
        addObject(wall122,15,5);
        Wall wall123 = new Wall();
        addObject(wall123,15,4);
        Wall wall124 = new Wall();
        addObject(wall124,15,6);
        Wall wall125 = new Wall();
        addObject(wall125,15,7);
        Wall wall126 = new Wall();
        addObject(wall126,15,8);
        Wall wall127 = new Wall();
        addObject(wall127,15,9);
        Wall wall128 = new Wall();
        addObject(wall128,15,10);
        Wall wall129 = new Wall();
        addObject(wall129,15,11);
        Wall wall130 = new Wall();
        addObject(wall130,15,12);
        Wall wall131 = new Wall();
        addObject(wall131,9,7);
        Wall wall132 = new Wall();
        addObject(wall132,9,9);
        Wall wall133 = new Wall();
        addObject(wall133,10,9);
        Wall wall134 = new Wall();
        addObject(wall134,10,7);
        Wall wall135 = new Wall();
        addObject(wall135,8,7);
        Wall wall136 = new Wall();
        addObject(wall136,8,8);
        Wall wall137 = new Wall();
        addObject(wall137,8,9);
        WinSpace winspace = new WinSpace();
        addObject(winspace,9,8);
        Wall wall138 = new Wall();
        addObject(wall138,15,14);
        Wall wall139 = new Wall();
        addObject(wall139,15,15);
        Wall wall140 = new Wall();
        addObject(wall140,14,15);
        Wall wall141 = new Wall();
        addObject(wall141,13,15);
        Wall wall142 = new Wall();
        addObject(wall142,11,15);
        Wall wall143 = new Wall();
        addObject(wall143,10,15);
        Wall wall144 = new Wall();
        addObject(wall144,12,15);
        Wall wall145 = new Wall();
        addObject(wall145,12,8);
        Wall wall146 = new Wall();
        addObject(wall146,12,7);
        Wall wall147 = new Wall();
        addObject(wall147,12,6);
        Wall wall148 = new Wall();
        addObject(wall148,12,10);
        Wall wall149 = new Wall();
        addObject(wall149,12,10);
        Wall wall150 = new Wall();
        addObject(wall150,12,9);
        Wall wall151 = new Wall();
        addObject(wall151,12,11);
        Wall wall152 = new Wall();
        addObject(wall152,12,12);
        Wall wall153 = new Wall();
        addObject(wall153,12,13);
        Wall wall154 = new Wall();
        addObject(wall154,13,6);
        Wall wall155 = new Wall();
        addObject(wall155,14,8);
        Wall wall156 = new Wall();
        addObject(wall156,13,10);
        Wall wall157 = new Wall();
        addObject(wall157,14,12);
        Wall wall158 = new Wall();
        addObject(wall158,14,14);
        Wall wall159 = new Wall();
        addObject(wall159,11,13);
        Wall wall160 = new Wall();
        addObject(wall160,10,13);
        Wall wall161 = new Wall();
        addObject(wall161,9,13);
        Wall wall162 = new Wall();
        addObject(wall162,10,11);
        Wall wall163 = new Wall();
        addObject(wall163,10,10);
        Wall wall164 = new Wall();
        addObject(wall164,8,10);
        Wall wall165 = new Wall();
        addObject(wall165,8,11);
        Wall wall166 = new Wall();
        addObject(wall166,8,13);
        Wall wall167 = new Wall();
        addObject(wall167,9,2);
        Wall wall168 = new Wall();
        addObject(wall168,8,2);
        Wall wall169 = new Wall();
        addObject(wall169,7,2);
        Wall wall170 = new Wall();
        addObject(wall170,5,2);
        Wall wall171 = new Wall();
        addObject(wall171,6,2);
        Wall wall172 = new Wall();
        addObject(wall172,4,2);
        Wall wall173 = new Wall();
        addObject(wall173,3,2);
        Wall wall174 = new Wall();
        addObject(wall174,2,2);
        Wall wall175 = new Wall();
        addObject(wall175,2,3);
        Wall wall176 = new Wall();
        addObject(wall176,2,4);
        Wall wall177 = new Wall();
        addObject(wall177,2,5);
        Wall wall178 = new Wall();
        addObject(wall178,2,6);
        Wall wall179 = new Wall();
        addObject(wall179,2,7);
        Wall wall180 = new Wall();
        addObject(wall180,2,8);
        Wall wall181 = new Wall();
        addObject(wall181,2,9);
        Wall wall182 = new Wall();
        addObject(wall182,2,10);
        Wall wall183 = new Wall();
        addObject(wall183,2,11);
        Wall wall184 = new Wall();
        addObject(wall184,2,12);
        Wall wall185 = new Wall();
        addObject(wall185,2,13);
        Wall wall186 = new Wall();
        addObject(wall186,2,14);
        Wall wall187 = new Wall();
        addObject(wall187,2,15);
        Wall wall188 = new Wall();
        addObject(wall188,3,15);
        Wall wall189 = new Wall();
        addObject(wall189,4,15);
        Wall wall190 = new Wall();
        addObject(wall190,5,15);
        Wall wall191 = new Wall();
        addObject(wall191,6,15);
        Wall wall192 = new Wall();
        addObject(wall192,7,15);
        Wall wall193 = new Wall();
        addObject(wall193,8,15);
        Wall wall194 = new Wall();
        addObject(wall194,4,14);
        Wall wall195 = new Wall();
        addObject(wall195,4,13);
        Wall wall196 = new Wall();
        addObject(wall196,4,12);
        Wall wall197 = new Wall();
        addObject(wall197,4,11);
        Wall wall198 = new Wall();
        addObject(wall198,4,9);
        Wall wall199 = new Wall();
        addObject(wall199,4,10);
        Wall wall200 = new Wall();
        addObject(wall200,4,8);
        Wall wall201 = new Wall();
        addObject(wall201,5,6);
        Wall wall202 = new Wall();
        addObject(wall202,4,6);
        Wall wall203 = new Wall();
        addObject(wall203,5,5);
        Wall wall204 = new Wall();
        addObject(wall204,4,5);
        wall201.setLocation(5,4);
        wall203.setLocation(6,4);
        Wall wall205 = new Wall();
        addObject(wall205,4,4);
        Wall wall206 = new Wall();
        addObject(wall206,7,4);
        Wall wall207 = new Wall();
        addObject(wall207,7,4);
        Wall wall208 = new Wall();
        addObject(wall208,8,4);
        Wall wall209 = new Wall();
        addObject(wall209,9,4);
        Wall wall210 = new Wall();
        addObject(wall210,10,4);
        Wall wall211 = new Wall();
        addObject(wall211,6,5);
        Wall wall212 = new Wall();
        addObject(wall212,6,6);
        Wall wall213 = new Wall();
        addObject(wall213,6,8);
        Wall wall214 = new Wall();
        addObject(wall214,6,7);
        Wall wall215 = new Wall();
        addObject(wall215,6,9);
        Wall wall216 = new Wall();
        addObject(wall216,6,11);
        Wall wall217 = new Wall();
        addObject(wall217,6,10);
        Wall wall218 = new Wall();
        addObject(wall218,6,12);
        Wall wall219 = new Wall();
        addObject(wall219,6,13);
        Wall wall220 = new Wall();
        addObject(wall220,7,6);
        Wall wall221 = new Wall();
        addObject(wall221,8,6);
        Wall wall222 = new Wall();
        addObject(wall222,9,6);
        Wall wall223 = new Wall();
        addObject(wall223,10,6);
        Player player = new Player();
        addObject(player,0,18);
        Wall wall224 = new Wall();
        addObject(wall224,17,11);
        wall100.setLocation(6,17);
        Wall wall225 = new Wall();
        addObject(wall225,16,14);     
        addObject(wall121,12,2);
        MazeWalker mazewalker = new MazeWalker();
        addObject(mazewalker,1,18);
        Wall wall226 = new Wall();
        addObject(wall226,12,2);
    }

    
}