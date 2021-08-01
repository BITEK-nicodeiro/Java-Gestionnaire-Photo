/* 
 
 
 N'oubliez de modifier dans le code l'emplacement du fichier.
 
Pour ma part c'est : C:\\Users\\nicor\\Desktop\\Projet\\image\\
faites Ctrl H pour remplacer automatiquement en appuyant ensuite sur "Replace All" !
 
 */
//On importe les bibliothèques
package projet; 
//Permet de lister les fichiers d'un répertoire, de savoir si un fichier existe, de renommer un fichier, de supprimer un fichier
import java.io.File; 
//C'est une exception qui signale qu'une tentative d'ouverture du fichier indiqué par un chemin d'accès spécifié a échoué
import java.io.FileNotFoundException;
//On peut l'utiliser dans Swing grâce à la classe ImageIcon qui est un composant des interfaces. On peut également créer une classe dérivant de JPanel et dessiner cette image.
import javax.swing.ImageIcon;
//Issu du projet Java Advanced Imaging, ce sont les classes du paquetage javax. imageio. Il est possible d'obtenir la taille d'un image sans décoder toute l'image. Pour un reader, une image peut être composer de plusieurs image.
import javax.imageio.ImageIO;
//BufferedImage hérite de java. awt. Image et correspond à un tableau rectangulaire de pixels
import java.awt.image.BufferedImage;
import java.io.IOException;
//Pour afficher les objets graphiques, contient des classes décrivant les composants graphiques, les polices, les couleurs et les images.
import java.awt.*;
//Permet de préciser l'espacement horizontal et vertical des composants.
import java.awt.BorderLayout;
//Contient les classes pour gérer simplement des fichiers journaux dans lesquels les applications laissent une trace de leur exécution.
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class Projet extends javax.swing.JFrame {
    JFrame frameaddcollection=new JFrame("Nom Collection");
    JButton Entrer=new JButton("Entrer");
    JTextField  nom = new JTextField();
    JTextArea bb=new JTextArea();
    JPanel pan = new JPanel(); 
    //tout cela initialise la fenêtre d'ajouter collection
    int image=1;
    //j'initialise de la variable image à 1 pour la fonction pro image
    
    public Projet() {
        initComponents();
        Entrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrerActionPerformed(evt);
            }
        });
        setSize(850,750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        //constructeur, initialisation
    }
                
    public void setcollection() {
        collection.removeAllItems();
        //on supprime tous les items de la combo box
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddCollection = new javax.swing.JButton();
        deposerphoto = new javax.swing.JButton();
        Deletecollection = new javax.swing.JButton();
        procollection = new javax.swing.JButton();
        Preccollection = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        collection = new javax.swing.JComboBox<>();
        proimage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Les photos");
        setBackground(new java.awt.Color(255, 255, 255));

        AddCollection.setBackground(new java.awt.Color(204, 204, 0));
        AddCollection.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        AddCollection.setText("Ajouter une collection");
        AddCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCollectionActionPerformed(evt);
            }
        });

        deposerphoto.setBackground(new java.awt.Color(204, 204, 0));
        deposerphoto.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        deposerphoto.setText("Déposer une photo/Retirer une photo");
        deposerphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposerphotoActionPerformed(evt);
            }
        });

        Deletecollection.setBackground(new java.awt.Color(204, 204, 0));
        Deletecollection.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Deletecollection.setText("Supprimer une collection");
        Deletecollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletecollectionActionPerformed(evt);
            }
        });

        procollection.setText("Prochaine collection");
        procollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procollectionActionPerformed(evt);
            }
        });

        Preccollection.setText("précédente collection");
        Preccollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreccollectionActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        collection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        collection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                collectionItemStateChanged(evt);
            }
        });

        proimage.setText("prochaine image");
        proimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proimageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddCollection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(Deletecollection)
                        .addGap(172, 172, 172)
                        .addComponent(deposerphoto)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Preccollection)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(collection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(procollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(proimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCollection)
                    .addComponent(deposerphoto)
                    .addComponent(Deletecollection))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procollection)
                    .addComponent(Preccollection)
                    .addComponent(collection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh)
                    .addComponent(proimage))
                .addGap(18, 18, 18)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void procollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procollectionActionPerformed
int selectedIndex = collection.getSelectedIndex();
// prendre l'index de la combo box
if (selectedIndex < collection.getItemCount()) { /*si l'index est inférieur au nombre d'item de la combo box alors... */
    collection.setSelectedIndex(selectedIndex + 1); 
    //on mets en place l'index selectedIndex + 1
    String dir;
    Object dj=collection.getSelectedItem();
    //on place une variable qui va prendre le nom choisit dans la combo box
    dir=dj.toString();
    //dir va le mettre en String
    File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir);
    //on va accéder au fichier souhaité grâce à la variable dir (mettez votre CHEMIN !!!)
    String []list=fichier.list();
    // va accéder aux images du fichier choisit
    int i=0;
        
    for(i=0;i<list.length;i++){
        BufferedImage img = null;
        try {
                img = ImageIO.read(new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir+"\\"+list[0]));
            } catch (IOException ex) {
                Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
            }
        ImageIcon icon=new ImageIcon(img);
        Image.setSize(WIDTH, HEIGHT);
        Image.setIcon(icon);
    }
    image=1;
    //on a selectionné l'image 0 grâce à la boucle, puis on a mis en place l'image = 1, si on change de collections alors cela remettra l'image à 1
}
    }//GEN-LAST:event_procollectionActionPerformed

    private void PreccollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreccollectionActionPerformed
int selectedIndex = collection.getSelectedIndex();
if (selectedIndex < collection.getItemCount()&&selectedIndex>0) {
    collection.setSelectedIndex(selectedIndex - 1); 
    String dir;
    Object dj=collection.getSelectedItem();
    dir=dj.toString();
    int i=0;
    File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir);
    String []list=fichier.list();
    for(i=0;i<list.length;i++){
        BufferedImage img = null;
        try {
                img = ImageIO.read(new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir+"\\"+list[0]));
            } catch (IOException ex) {
                Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
            }
        ImageIcon icon=new ImageIcon(img);
        Image.setSize(WIDTH, HEIGHT);
        Image.setIcon(icon);
    }
    image=1;  
}
// la même chose mais l'inverse (car pour précedente image)
    }//GEN-LAST:event_PreccollectionActionPerformed

    private void AddCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCollectionActionPerformed
    frameaddcollection.setSize(400,400);
    // fenêtre de 400 pixels sur 400 pixels
    frameaddcollection.setLayout(new BorderLayout());
    //permet d'organiser la disposition du contenu de la fenêtre
    frameaddcollection.getContentPane().add(pan.add(nom),BorderLayout.NORTH);
    frameaddcollection.getContentPane().add(pan.add(bb),BorderLayout.CENTER);
    frameaddcollection.getContentPane().add(pan.add(Entrer),BorderLayout.SOUTH);
    frameaddcollection.setVisible(true);
    }//GEN-LAST:event_AddCollectionActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
    collection.removeAllItems();
        File created=new File("C:\\Users\\nicor\\Desktop\\Projet\\image");
        String[] file= created.list();
          for (String path : file) {
            collection.addItem(path);
        // à chaque fois on va refresh les items, si jamais il y'a une nouvelle collection ou alors une collection qui a été supprimé cela va refresh 
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void DeletecollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletecollectionActionPerformed
String dir;
Object dj=collection.getSelectedItem();
dir=dj.toString();
File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir)  ;
File[] files = fichier.listFiles();
for(File f:files)f.delete();
fichier.delete();
// accéder au fichier, et supprimer le fichier et tout ce qui a dedans (les images).
    }//GEN-LAST:event_DeletecollectionActionPerformed

    private void deposerphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposerphotoActionPerformed
    String dir;
    Object pj=collection.getSelectedItem();
    dir=pj.toString();
       try {
           Desktop.getDesktop().open((new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir)));
       } catch (IOException ex) {
           Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
       }
    //va ouvrir la fenêtre du dossier choisi puis on va pouvoir ajouter la photo.
    }//GEN-LAST:event_deposerphotoActionPerformed

    private void collectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_collectionItemStateChanged
String dir;
Object dj=collection.getSelectedItem();
dir=dj.toString();
int i=0;
File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir);
     String []list=fichier.list();
         for(i=0;i<list.length;i++){
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir+"\\"+list[0]));
            } catch (IOException ex) {
                Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon icon=new ImageIcon(img);
            Image.setSize(WIDTH, HEIGHT);
            Image.setIcon(icon);
         }
         image=1;
//similaire aux fonctions pro collections et pre collections, elle permet en choisissant dans la combo box l'item demandé, de montrer la première image de ce fichier
    }//GEN-LAST:event_collectionItemStateChanged

    private void proimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proimageActionPerformed
String dir;
Object dj=collection.getSelectedItem();
dir=dj.toString();
File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir);
String []list=fichier.list();     
         if(image<list.length){
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+dir+"\\"+list[image]));
            } catch (IOException ex) {
                Logger.getLogger(Projet.class.getName()).log(Level.SEVERE, null, ex);
            }
        ImageIcon icon=new ImageIcon(img);
        Image.setSize(WIDTH, HEIGHT);
        Image.setIcon(icon);  
    }
    image++;
//va acceder au fichier demandé, et lire les images lorsqu'on appui sur le bouton et les afficher, si l'image est supérieur à la taille de list alors cela s'arrête.
    }//GEN-LAST:event_proimageActionPerformed

    public void EntrerActionPerformed(java.awt.event.ActionEvent evt){
 if(nom.getText()!=null){
    File fichier=new File("C:\\Users\\nicor\\Desktop\\Projet\\image\\"+nom.getText());           
        if(fichier.exists()) {
           bb.setText("Il existe!! Change le nom de ta collection");
           nom.setText("");
        }
        else{
            fichier.mkdir();
            bb.setText("CA marche!! Refresh");
            nom.setText("");
       }
    //si on appuie sur le bouton et que ce qui a été écrit n'existe pas, alors un nouveau dossier est crée sinon il demande un nouveau nom.
 }
}
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Projet projet=new Projet();
        projet.setcollection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCollection;
    private javax.swing.JButton Deletecollection;
    private javax.swing.JLabel Image;
    private javax.swing.JButton Preccollection;
    private javax.swing.JComboBox<String> collection;
    private javax.swing.JButton deposerphoto;
    private javax.swing.JButton procollection;
    private javax.swing.JButton proimage;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
