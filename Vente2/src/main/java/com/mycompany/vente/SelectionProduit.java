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
public class SelectionProduit extends javax.swing.JPanel {

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
    public SelectionProduit() {
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
        jLabelNomProduit = new javax.swing.JLabel();
        jLabelNomCategorie = new javax.swing.JLabel();
        jLabelTarif = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelPopulariter = new javax.swing.JLabel();
        jLabelProduit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCategorie = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonAcheter = new javax.swing.JButton();
        jTextFieldImage = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        jTextFieldQuantiterProduit = new javax.swing.JTextField();

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

        jButtonAcheter.setText("Acheter");
        jButtonAcheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcheterActionPerformed(evt);
            }
        });

        jTextFieldImage.setText("IMAGE");
        jTextFieldImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldImageActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jTextFieldQuantiterProduit.setText("1");
        jTextFieldQuantiterProduit.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldQuantiterProduitCaretUpdate(evt);
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
                            .addComponent(jLabelCategorie)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelProduit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabelNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTarif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPopulariter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldQuantiterProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAcheter)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNomProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabelTarif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabelPopulariter, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAcheter)
                            .addComponent(jTextFieldQuantiterProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        afficherProduitDansListAvecCategorie();
    }//GEN-LAST:event_jListCategorieMouseClicked

    private void jListProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProduitMouseClicked
        produit = jListProduit.getSelectedValue();
        String sql = "SELECT * FROM produit INNER JOIN categorie ON produit.idCategorie = categorie.idCategorie WHERE libelleProduit LIKE '" + produit + "'";

        ResultSet Tuples = DaoSIO.getInstance().requeteSelection(sql);
        try {
            while (Tuples.next()) {
                idProduit = Tuples.getString("idProduit");
                jLabelNomCategorie.setText(Tuples.getString("libelleCategorie"));
                jLabelNomProduit.setText(Tuples.getString("libelleProduit"));
                jLabelTarif.setText(Tuples.getString("prix") + "€");
                prix = Float.parseFloat(Tuples.getString("prix"));
                System.out.println(prix);
                jLabelStock.setText(Tuples.getString("stock"));
                jLabelPopulariter.setText(Tuples.getString("popularite") + "/5");
                jTextFieldImage.setText(Tuples.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectionProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jListProduitMouseClicked

    private void jTextFieldImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldImageActionPerformed
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
        jLabelNomCategorie.setText("");
        jLabelNomProduit.setText("");
        jLabelTarif.setText("");
        jLabelStock.setText("");
        jLabelPopulariter.setText("");
        jTextFieldImage.setText("");
        afficherProduitDansListAvecCategorie();
        afficherCategorieDansList();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonAcheterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcheterActionPerformed

quantiter = Integer.parseInt(jTextFieldQuantiterProduit.getText());
        try {
//            Integer.parseInt(jTextFieldQuantiterProduit.getText());
            if (quantiter <= 0) {
                JOptionPane.showMessageDialog(null, "Veuillez selectionner un nombre au dela de 0");
            } else {
//                System.out.println("ca fonctionne");

prixTotal = prix*quantiter;
                if (OK) {
                    
                }
                ValidationVente Validation = new ValidationVente();
                Validation.show();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un nombre");
        }

    }//GEN-LAST:event_jButtonAcheterActionPerformed

    private void jTextFieldQuantiterProduitCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldQuantiterProduitCaretUpdate

    }//GEN-LAST:event_jTextFieldQuantiterProduitCaretUpdate

    /**
     * Permet d'afficher dans la jliste la liste des catégories dispo
     */
    public void afficherCategorieDansList() {
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
            Logger.getLogger(SelectionProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Permet d'afficher dans la Jlist Produit les produit dispo
     */
    public void afficherProduitDansListAvecCategorie() {
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
            Logger.getLogger(SelectionProduit.class.getName()).log(Level.SEVERE, null, ex);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcheter;
    private javax.swing.JButton jButtonRechercheCat;
    private javax.swing.JButton jButtonRechercheProd;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCategorie;
    private javax.swing.JLabel jLabelNomCategorie;
    private javax.swing.JLabel jLabelNomProduit;
    private javax.swing.JLabel jLabelPopulariter;
    private javax.swing.JLabel jLabelProduit;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTarif;
    private javax.swing.JList<String> jListCategorie;
    private javax.swing.JList<String> jListProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldImage;
    private javax.swing.JTextField jTextFieldQuantiterProduit;
    private javax.swing.JTextField jTextFieldRechercheCat;
    private javax.swing.JTextField jTextFieldRechercheProd;
    // End of variables declaration//GEN-END:variables
}
