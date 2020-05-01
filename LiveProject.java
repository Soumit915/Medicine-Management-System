import java.util.*;
class LiveProject
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("\t\t\t\t\t\t  Welcome to LifeLine Chemists and Drugists");
        
        System.out.print("\t\t\t\tThe medicines available at present in the stores are,\n\t\t\t\t1>. Volini,\n\t\t\t\t2>. Vitix,\n\t\t\t\t3>. Secalia,\n\t\t\t\t4>. Itch Guard,\n\t\t\t\t5>. Liv.52,\n\t\t\t\t6>. Melaguard 50T,\n\t\t\t\t7>. Betadine,\n\t\t\t\t8>. Unienzyme,\n\t\t\t\t9>. Ovrall,\n\t\t\t\t10>. Clotrumazole Cream IP,\n\t\t\t\t11>. Topinate Gel,\n\t\t\t\t12>. E Cod Plus,\n\t\t\t\t13>. Ring Guard,\n\t\t\t\t14>. T Top,and,\n\t\t\t\t15>. Tacroz,\n\t\t\t\tEnter the medicine you want to choose : ");
        int a = sc.nextInt();
        int i;
        
        int ser[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String nom[] = {"VOLINI","VITIX","SECALIA","ITCH GUARD","LIV.52","MELAGUARD 50T","BETADINE","UNIENZYME","OVRALL","CLOTRUMAZOLE CREAM IP","TOPINATE GEL","E COD PLUS","RING GUARD","T TOP","TACROZ"};
        String company[] = {"RANBUXY","WOCKHARDT","MICRO LABROTRORY LTD","RECKITT BENCKISER HEALTHCARE","HIMALAYA","ABBOT","MEDICARE","UNICHEM-GROUP OF INDRUTRIES","WYETH LIMITED","CANDID","SYSTOPIC LABORATORIE PVT. LTD.","ALUVARIA","RECKITT BENCKISER HEALTH CARE","WALLACE PHARMACUETICALS PVT. LTD","GLENMARK PHARMACEUTICALS PVT. LTD."};
        String btchcode[] = {"LCD456","LCD364","LCD473","LCD229","LCD235","LCD321","LCD192","LCD056","LCD471","LCD731","LCD093","LCD691","LCD521","LCD201","LCD336"};
        String compo[] = {"Diclofenac Diethylamine-1.16% w/w9equivalent to Diclofenac sodium 1% w/w)\n\t\t\t\t           Linseed oil-3% w/w\n\t\t\t\t           Methyl Salicylate IP-10% w/w\n\t\t\t\t           Menthol IP-5% w/w\n\t\t\t\t           Benzyl Alcohol IP-1% w/w\n\t\t\t\t           Gel base-q.s.","Aqua\n\t\t\t\t           Propylene Glycol\n\t\t\t\t           Melon(Cumio melo)extract\n\t\t\t\t           Carbomer\n\t\t\t\t           Acrylates/c10-30 Alkyl Acylate Crosspolymer\n\t\t\t\t           Sodium Hydroxide\n\t\t\t\t           Diazolidinyl urea\n\t\t\t\t           Methylparaben\n\t\t\t\t           Propylparaben\n\t\t\t\t           Hydrozenated palm oil","Glyserin IP-15% w/w\n\t\t\t\t           Cream base-q.s.","(Per 100ml)Clotriazole IP-1% w/w\n\t\t\t\t           Menthol IP-1% w/w\n\t\t\t\t           Boric acid IP-1% w/w\n\t\t\t\t           Zinc oxide IP-5% w/w\n\t\t\t\t           Cream Base-q.s.","(Per tablet)Himsra(Capparis spinosa)Rt.-65mg\n\t\t\t\t           Kasani(Cichorum intybus)Sd.-65mg\n\t\t\t\t           Mandur bhasma-33mg\n\t\t\t\t           Kakamachi(Solanum nigrum)Bk.-32mg\n\t\t\t\t           Arjuna(Terminalia arjuna)Bk.-32mg\n\t\t\t\t           Karmarda(Cassia accidentalis)Sd.-16mg\n\t\t\t\t           Birajasipha(Acbilla millefolium)Ap-16mg\n\t\t\t\t           Jhavaka(Tamaix galica)wh.pl.-16mg","Octinoxate USP-7.5% w/w\n\t\t\t\t           Avobenzone USP-2.0% w/w\n\t\t\t\t           Oxybenzone USP-3.0% w/w\n\t\t\t\t           Octocrylene USP-3.0% w/w\n\t\t\t\t           Zinc oxide IP-3.0% w/w\n\t\t\t\t           Base- q.s.","Povidone-Iodine IP-10% w/w\n\t\t\t\t           Purified water IP-q.s.","Fungal Diastase(1:800)IP-100mg(Derived from Aspergillus oryzae)\n\t\t\t\t           Papain IP-60mg\n\t\t\t\t           activated charcoal-75mg(Appropriate averages added)\n\t\t\t\t           Printing colour Titanium Dioxide","(Per tablet)Levonorgestrel IP-0.15mg\n\t\t\t\t           Ethinyloestradio IP-0.03mg","Clotrimazole IP-1% w/w\n\t\t\t\t           In water misale base-q.s.\n\t\t\t\tPreservatives : Benzyl Alcohol IP-1% w/w\n\t\t\t\t           Methylparaben IP-0.15% w/w\n\t\t\t\t           Propylparaben IP-0.15% w/w","Clobelasol propionale BP-0.05% w/w\n\t\t\t\t           Gel base-q.s.","Soyn oil;Gelatin-Animal Origin;Cod lever oil;Wheat Germ oil\n\t\t\t\t           Glycerine;Vitamins;Hydrogenated Vegetable oil\n\t\t\t\t           Bee Wax;Colour(150d);Preservative(218) and Purified water","(Per 100g)Miconazole Nitrate IP-2% w/w\n\t\t\t\t           Neomylin Sulphate IP-0.5% w/w\n\t\t\t\t           Chlorocesol IP-0.1% w/w\n\t\t\t\t           Cream Base-q.s.","Tacrolimas-0.1% w/w\n\t\t\t\t           Ointment base-q.s.","Tacrolimus USP-0.1% w/w\n\t\t\t\t           Ointment base-q.s."};
        String mfd[] = {"08/2015","11/2014","02/2015","12/2014","11/2014","8/2014","12/2014","8/2014","5/2015","7/2015","3/2015","7/2014","7/2015","8/2015","2/2017"};
        String expd[] = {"01/2017","10/2019","02/2017","11/2017","11/2017","7/2016","11/2016","01/2016","9/2017","7/2019","03/2017","12/2017","06/2018","02/2017","02/2016"};
        String cost[] = {"75","1193","105","53","75","342","95.50","68.10(per 21 tablets)","75(per 15 tablets)","150","225","170(per 15 tablets)","50","225","175"};
        
        for(i = 0;i < 15;i++)
        {
            if(a == ser[i])
            {
                System.out.println("\t\t\t\tName of the medicine is " + nom[i]);
                System.out.println("\t\t\t\tThe Brand Company name is " + company[i]);
                System.out.println("\t\t\t\tThe Batchcode is " + btchcode[i]);
                System.out.println("\t\t\t\tComposition : " + compo[i]);
                System.out.println("\t\t\t\tThe manufactured date is : " + mfd[i]);
                System.out.println("\t\t\t\tThe expiry date is : " + expd[i]);
                System.out.println("\t\t\t\tThe cost of this medicine is : Rs " + cost[i]);
                System.out.println("\t\t\t\tAvailabality : Yes");
            }
        }
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
    }
}