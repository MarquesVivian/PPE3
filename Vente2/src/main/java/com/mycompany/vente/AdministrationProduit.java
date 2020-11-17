/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author v.marques
 */
public class AdministrationProduit extends javax.swing.JPanel {

    private static String rechercheCategorie;
    private static String rechercheProduit;
    public static String categorie = "%";
    public static String produit = "%";
    public static String idProduit;
    public static Float prix;
    public static Float prixTotal;
    /**
     * quantiter de SelectionProduit
     */
    public static Integer quantiter;
    public boolean OK;

    /**
     * Creates new form categorie
     */
    public AdministrationProduit() {
//        System.out.println(" la class selectionProduit se lance");//Pour savoir si ca fonctionne 
        initComponents();
        //Mettre les 2 e ndessous en commentaire pour le placer sur jFrame Accueil
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListCategorie = new javax.swing.JList<>();
        jTextFieldRechercheCat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProduit = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRechercheProd = new javax.swing.JTextField();
        jButtonRechercheProd = new javax.swing.JButton();
        jButtonRechercheCat = new javax.swing.JButton();
        jLabelPopulariter = new javax.swing.JLabel();
        jLabelProduit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCategorie = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();
        jTextFieldProduit = new javax.swing.JTextField();
        jTextFieldCategorie = new javax.swing.JTextField();
        jTextFieldTarif = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldPopulariter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldImage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAjouterCategorie = new javax.swing.JTextField();
        jButtonModifierProduit = new javax.swing.JButton();
        jButtonCreerProduit = new javax.swing.JButton();
        jButtonModifierCategorie = new javax.swing.JButton();
        jButtonCreerCategorie = new javax.swing.JButton();

        jListCategorie.setModel(new DefaultListModel());
        jListCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCategorieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListCategorie);

        jLabel1.setText("Recherche Catégorie:");

        jLabel3.setText("Catégories :");

        jLabel2.setText("Produit :");

        jListProduit.setModel(new DefaultListModel());
        jListProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProduitMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListProduit);

        jLabel4.setText("Recherche Produit :");

        jButtonRechercheProd.setText("Rechercher");
        jButtonRechercheProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheProdActionPerformed(evt);
            }
        });

        jButtonRechercheCat.setText("Rechercher");
        jButtonRechercheCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheCatActionPerformed(evt);
            }
        });

        jLabelProduit.setText("Produit :");

        jLabel6.setText("Populariter :");

        jLabelCategorie.setText("Catégorie :");

        jLabel9.setText("Tarif :");

        jLabel10.setText("Stock :");

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jLabel5.setText("Image :");

        jLabel7.setText("Categorie :");

        jButtonModifierProduit.setText("Modifier");
        jButtonModifierProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierProduitActionPerformed(evt);
            }
        });

        jButtonCreerProduit.setText("Créer");
        jButtonCreerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreerProduitActionPerformed(evt);
            }
        });

        jButtonModifierCategorie.setText("Modifier");
        jButtonModifierCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierCategorieActionPerformed(evt);
            }
        });

        jButtonCreerCategorie.setText("Créer");
        jButtonCreerCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreerCategorieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonRechercheCat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldRechercheCat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jButtonRefresh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonRechercheProd, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jTextFieldRechercheProd)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabelPopulariter)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAjouterCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelProduit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonModifierCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCreerCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCategorie, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldTarif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPopulariter)
                                    .addComponent(jTextFieldProduit)
                                    .addComponent(jTextFieldCategorie, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonModifierProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCreerProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRechercheCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRechercheProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRechercheProd)
                    .addComponent(jButtonRechercheCat)
                    .addComponent(jButtonRefresh))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabelPopulariter, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProduit)
                            .addComponent(jTextFieldProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldAjouterCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModifierProduit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCategorie)
                                    .addComponent(jTextFieldCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCreerProduit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModifierCategorie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCreerCategorie)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldPopulariter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRechercheCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheCatActionPerformed
        afficherCategorieDansList();
        rechercheProduit = "%";
    }//GEN-LAST:event_jButtonRechercheCatActionPerformed

    private void jButtonRechercheProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheProdActionPerformed
        afficherProduitDansListAvecCategorie();
        rechercheProduit = "%";
    }//GEN-LAST:event_jButtonRechercheProdActionPerformed

    private void jListCategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCategorieMouseClicked
        categorie = jListCategorie.getSelectedValue();
        jTextFieldAjouterCategorie.setText(categorie);
        afficherProduitDansListAvecCategorie();
    }//GEN-LAST:event_jListCategorieMouseClicked

    private void jListProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProduitMouseClicked
        produit = jListProduit.getSelectedValue();
        String sql = "SELECT * FROM produit INNER JOIN categorie ON produit.idCategorie = categorie.idCategorie WHERE libelleProduit LIKE '" + produit + "'";

        ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
        try {
            while (Tuples.next()) {
                idProduit = Tuples.getString("idProduit");
                jTextFieldCategorie.setText(Tuples.getString("libelleCategorie"));
                jTextFieldProduit.setText(Tuples.getString("libelleProduit"));
                jTextFieldTarif.setText(Tuples.getString("prix") + " €");
                prix = Float.parseFloat(Tuples.getString("prix"));
                jTextFieldStock.setText(Tuples.getString("stock"));
                jTextFieldImage.setText(Tuples.getString("image"));
                jTextFieldPopulariter.setText(Tuples.getString("popularite") + "/5");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrationProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jListProduitMouseClicked
    /**
     * on remet tout a zéro pour les recherche
     *
     * @param evt
     */
    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        rechercheCategorie = "%";
        rechercheProduit = "%";
        categorie = "%";
        produit = "%";
        jTextFieldCategorie.setText("");
        jTextFieldProduit.setText("");
        jTextFieldTarif.setText("");
        jTextFieldStock.setText("");
        jTextFieldPopulariter.setText("");
        jTextFieldImage.setText("");
        afficherProduitDansListAvecCategorie();
        afficherCategorieDansList();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonCreerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerProduitActionPerformed
        String libelleProduit = jTextFieldProduit.getText();
        String nomCategorie = jTextFieldCategorie.getText();
        String prixAjouter = jTextFieldTarif.getText();
        String stock = jTextFieldStock.getText();
        String urlImage = jTextFieldImage.getText();
        String populariter = jTextFieldPopulariter.getText();
        Integer idCategorie = null;

        String sqlRechercheIdCategorie = "SELECT * FROM `categorie` WHERE `libelleCategorie` LIKE '" + nomCategorie + "'";
        ResultSet TuplesRechercheIdCategorie = DaoSIO.getInstance().requeteSelection(sqlRechercheIdCategorie);
        try {
            while (TuplesRechercheIdCategorie.next()) {
                idCategorie = Integer.parseInt(TuplesRechercheIdCategorie.getString("idCategorie"));
                String sqlCreerProduit = "INSERT INTO `produit`(`libelleProduit`, `prix`, `stock`, `image`, `popularite`, `idCategorie`) VALUES"
                        + " ('" + libelleProduit + "','" + prixAjouter + "','" + stock + "','" + urlImage + "','" + populariter + "','" + idCategorie + "')";
                int TuplesCreerProduit = DaoSIO.getInstance().requeteAction(sqlCreerProduit);
                if (TuplesCreerProduit == 1) {
                    System.out.println("Bien fait pour la création de produit");
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectionProduit.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonCreerProduitActionPerformed

    private void jButtonCreerCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerCategorieActionPerformed
        String libelleCategorie = jTextFieldAjouterCategorie.getText();
        String sqlCreerCategorie = "INSERT INTO `categorie`(`libelleCategorie`) VALUES ('"+libelleCategorie+"')";
        int TuplesCreerCategorie = DaoSIO.getInstance().requeteAction(sqlCreerCategorie);
        if (TuplesCreerCategorie == 1) {
                    System.out.println("Bien fait pour la création de la categorie");
                }
    }//GEN-LAST:event_jButtonCreerCategorieActionPerformed

    private void jButtonModifierProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModifierProduitActionPerformed

    private void jButtonModifierCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModifierCategorieActionPerformed

    /**
     * Permet d'afficher dans la jliste la liste des catégories dispo
     */
    private void afficherCategorieDansList() {
        //Innitialisation
        rechercheCategorie = jTextFieldRechercheCat.getText();
        DefaultListModel leModelCategorie = (DefaultListModel) jListCategorie.getModel();
        //clear des model des listes
        leModelCategorie.clear();
        //Requete qui nous donne le nom du produit en fonction de la Recherche précedante et du nom du produit
        String sql = "SELECT * FROM categorie WHERE libelleCategorie LIKE '%" + rechercheCategorie + "%'";
        ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
        try {
            while (Tuples.next()) {
                leModelCategorie.addElement(Tuples.getString("libelleCategorie"));//ajoute la categorie a la liste
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdministrationProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Permet d'afficher dans la Jlist Produit les produit dispo
     */
    private void afficherProduitDansListAvecCategorie() {
        rechercheProduit = jTextFieldRechercheProd.getText();
        DefaultListModel leModelProduit = (DefaultListModel) jListProduit.getModel();
        leModelProduit.clear();
        String sql = "SELECT * FROM produit INNER JOIN categorie ON produit.idCategorie = categorie.idCategorie WHERE libelleProduit LIKE '%" + rechercheProduit + "%' AND libelleCategorie LIKE '%" + categorie + "%'";

        ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
        try {
            while (Tuples.next()) {
                leModelProduit.addElement(Tuples.getString("libelleProduit"));//ajoute le produit a la liste
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrationProduit.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void AfficherTouteListe() {
        afficherCategorieDansList();
        afficherProduitDansListAvecCategorie();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreerCategorie;
    private javax.swing.JButton jButtonCreerProduit;
    private javax.swing.JButton jButtonModifierCategorie;
    private javax.swing.JButton jButtonModifierProduit;
    private javax.swing.JButton jButtonRechercheCat;
    private javax.swing.JButton jButtonRechercheProd;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCategorie;
    private javax.swing.JLabel jLabelPopulariter;
    private javax.swing.JLabel jLabelProduit;
    private javax.swing.JList<String> jListCategorie;
    private javax.swing.JList<String> jListProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAjouterCategorie;
    private javax.swing.JTextField jTextFieldCategorie;
    private javax.swing.JTextField jTextFieldImage;
    private javax.swing.JTextField jTextFieldPopulariter;
    private javax.swing.JTextField jTextFieldProduit;
    private javax.swing.JTextField jTextFieldRechercheCat;
    private javax.swing.JTextField jTextFieldRechercheProd;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldTarif;
    // End of variables declaration//GEN-END:variables
}
