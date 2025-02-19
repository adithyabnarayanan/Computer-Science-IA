/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.computerscienceia.effortgradegenerator.GUI;

import com.computerscienceia.effortgradegenerator.Classes.HomeworkNodeList;
import com.computerscienceia.effortgradegenerator.Classes.ListInitialization;
import com.computerscienceia.effortgradegenerator.Classes.Student;
import com.computerscienceia.effortgradegenerator.Classes.TeacherManager;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adith
 */
public class ClassManager extends javax.swing.JFrame {

    /**
     * Creates new form ClassManager
     */
    public ClassManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        signedInName = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        JTabbedPanePane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfStudents = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        addStudent = new javax.swing.JButton();
        removeStudent = new javax.swing.JButton();
        generateEffort = new javax.swing.JButton();
        addNewStudent = new javax.swing.JButton();
        generateEffort1 = new javax.swing.JButton();
        Homeworks = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfHomeworks = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        addHomework = new javax.swing.JButton();
        removeHomework = new javax.swing.JButton();
        markHomework = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOfQuarterTests = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        addQuarterAssessment = new javax.swing.JButton();
        removeQuarterAssessment = new javax.swing.JButton();
        markAssessment = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listOfSemesterExams = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        addSemesterExam = new javax.swing.JButton();
        removeSemesterExam = new javax.swing.JButton();
        markSemesterExam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage classes");

        jLabel3.setText("Signed in as:");

        signedInName.setText(EffortGradeGenerator.primaryTeacher.getFirstName() + " " + EffortGradeGenerator.primaryTeacher.getLastName()
        );

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        listOfStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ListInitialization.listOfStudentsAsStrings();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listOfStudents);

        jLabel2.setText("Students:");

        addStudent.setText("Add an existing Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        removeStudent.setText("Remove Student");
        removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentActionPerformed(evt);
            }
        });

        generateEffort.setText("Generate Effort Grade for Student");
        generateEffort.setToolTipText("");
        generateEffort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateEffortActionPerformed(evt);
            }
        });

        addNewStudent.setText("Add a new Student");
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });

        generateEffort1.setText("View Effort Grade History for Student");
        generateEffort1.setToolTipText("");
        generateEffort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateEffort1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addNewStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(generateEffort))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(generateEffort1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(addNewStudent)
                        .addGap(18, 18, 18)
                        .addComponent(addStudent)
                        .addGap(18, 18, 18)
                        .addComponent(removeStudent)
                        .addGap(18, 18, 18)
                        .addComponent(generateEffort)
                        .addGap(18, 18, 18)
                        .addComponent(generateEffort1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        JTabbedPanePane.addTab("Students", jPanel1);

        listOfHomeworks.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ListInitialization.listOfHomeworksAsStrings();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listOfHomeworks);

        jLabel7.setText("Homeworks:");

        addHomework.setText("Add Homework");
        addHomework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHomeworkActionPerformed(evt);
            }
        });

        removeHomework.setText("Remove Homework");
        removeHomework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHomeworkActionPerformed(evt);
            }
        });

        markHomework.setText("Mark Homework");
        markHomework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markHomeworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeworksLayout = new javax.swing.GroupLayout(Homeworks);
        Homeworks.setLayout(HomeworksLayout);
        HomeworksLayout.setHorizontalGroup(
            HomeworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeworksLayout.createSequentialGroup()
                .addGroup(HomeworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeworksLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(HomeworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(HomeworksLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(addHomework)
                        .addGap(18, 18, 18)
                        .addComponent(removeHomework)
                        .addGap(18, 18, 18)
                        .addComponent(markHomework)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        HomeworksLayout.setVerticalGroup(
            HomeworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeworksLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(HomeworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHomework)
                    .addComponent(removeHomework)
                    .addComponent(markHomework))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedPanePane.addTab("Homework", Homeworks);

        listOfQuarterTests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ListInitialization.listOfQuarterAssessmentsAsStrings();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listOfQuarterTests);

        jLabel9.setText("Assessments:");

        addQuarterAssessment.setText("Add Assessment");
        addQuarterAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuarterAssessmentActionPerformed(evt);
            }
        });

        removeQuarterAssessment.setText("Remove Assessment");
        removeQuarterAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeQuarterAssessmentActionPerformed(evt);
            }
        });

        markAssessment.setText("Mark Assessment");
        markAssessment.setToolTipText("");
        markAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markAssessmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addQuarterAssessment)
                .addGap(18, 18, 18)
                .addComponent(removeQuarterAssessment)
                .addGap(18, 18, 18)
                .addComponent(markAssessment)
                .addGap(126, 126, 126))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuarterAssessment)
                    .addComponent(removeQuarterAssessment)
                    .addComponent(markAssessment))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedPanePane.addTab("Quarter Tests", jPanel4);

        listOfSemesterExams.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ListInitialization.listOfSemesterExamsAsStrings();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listOfSemesterExams);

        jLabel10.setText("Exams:");

        addSemesterExam.setText("Add Assessment");
        addSemesterExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSemesterExamActionPerformed(evt);
            }
        });

        removeSemesterExam.setText("Remove Assessment");
        removeSemesterExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSemesterExamActionPerformed(evt);
            }
        });

        markSemesterExam.setText("Mark Assessment");
        markSemesterExam.setToolTipText("");
        markSemesterExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markSemesterExamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addSemesterExam)
                .addGap(18, 18, 18)
                .addComponent(removeSemesterExam)
                .addGap(18, 18, 18)
                .addComponent(markSemesterExam)
                .addGap(125, 125, 125))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSemesterExam)
                    .addComponent(removeSemesterExam)
                    .addComponent(markSemesterExam))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedPanePane.addTab("Semester Exams", jPanel5);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class Manager");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Class:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText(EffortGradeGenerator.primaryClass.getClassName());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signedInName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14))
                    .addComponent(JTabbedPanePane)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTabbedPanePane, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signedInName)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        ClassManager newFrame = new ClassManager();
        newFrame.JTabbedPanePane.setSelectedIndex(this.JTabbedPanePane.getSelectedIndex());
        this.dispose();
        newFrame.setVisible(true);
        
    }//GEN-LAST:event_refreshActionPerformed

    private void removeQuarterAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeQuarterAssessmentActionPerformed
        if(listOfQuarterTests.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select an assessment");
       }else{
        String examName = listOfQuarterTests.getSelectedValue();
        EffortGradeGenerator.primaryClass.removeQuarterTest(examName);
        try {
            TeacherManager.save("Effort Grade Generator");
        } catch (IOException e) {
        }
        this.dispose();
        new ClassManager().setVisible(true);
        }
    }//GEN-LAST:event_removeQuarterAssessmentActionPerformed

    private void removeHomeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeHomeworkActionPerformed
        if(listOfHomeworks.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select a homework");
       }else{
        String homeworkName = (String)listOfHomeworks.getSelectedValue();
        EffortGradeGenerator.primaryClass.removeHomework(homeworkName);
        this.dispose();
        new ClassManager().setVisible(true);
        }
        try {
            TeacherManager.save("Effort Grade Generator");
        } catch (IOException e) {
        }
    }//GEN-LAST:event_removeHomeworkActionPerformed

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        new AddNewStudent().setVisible(true);
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void generateEffortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateEffortActionPerformed
        if(listOfStudents.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Please select a student");
        }else{
            String studentName = (String)listOfStudents.getSelectedValue();
            String[] _arr = studentName.split("\\s");
             int id = Integer.parseInt(_arr[2]);
            ArrayList<Student> listOfStudentsClass = EffortGradeGenerator.primaryClass.getListOfStudents();
            for(int i =0; i<listOfStudentsClass.size(); i++){
            if(listOfStudentsClass.get(i).getId() == id){
                EffortGradeGenerator.primaryStudent = listOfStudentsClass.get(i);
            }
            }
            new EffortGradeGeneration().setVisible(true);
        }
        
    }//GEN-LAST:event_generateEffortActionPerformed

    private void removeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentActionPerformed
        if(listOfStudents.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Please select a student");
        }else{
        String studentName = (String)listOfStudents.getSelectedValue();
        String[] _arr = studentName.split("\\s");
        int id = Integer.parseInt(_arr[2]);
        System.out.println(id);
        ArrayList<Student> listOfStudentsClass = EffortGradeGenerator.primaryClass.getListOfStudents();
        for(int i =0; i<listOfStudentsClass.size(); i++){
            if(listOfStudentsClass.get(i).getId() == id){
                Student removalObject = listOfStudentsClass.get(i);
                EffortGradeGenerator.primaryClass.removeStudent(removalObject);
            }
        }
        }
        try {
            TeacherManager.save("Effort Grade Generator");
        } catch (IOException e) {
        }
        this.dispose();
        new ClassManager().setVisible(true);
    }//GEN-LAST:event_removeStudentActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        new AddExistingStudent().setVisible(true);
    }//GEN-LAST:event_addStudentActionPerformed

    private void removeSemesterExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSemesterExamActionPerformed
        if(listOfSemesterExams.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select an assessment");
       }
        String examName = listOfSemesterExams.getSelectedValue();
        EffortGradeGenerator.primaryClass.removeSemesterExam(examName);
        try {
            TeacherManager.save("Effort Grade Generator");
        } catch (IOException e) {
        }
        this.dispose();
        new ClassManager().setVisible(true);
    }//GEN-LAST:event_removeSemesterExamActionPerformed

    private void addHomeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHomeworkActionPerformed
        new AddHomework().setVisible(true);
    }//GEN-LAST:event_addHomeworkActionPerformed

    private void markHomeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markHomeworkActionPerformed
        if(listOfHomeworks.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select a homework");
        }else{
            String homeworkNameString = listOfHomeworks.getSelectedValue();
            EffortGradeGenerator.primaryHomework = homeworkNameString;
            new MarkHomework().setVisible(true);
        }
    }//GEN-LAST:event_markHomeworkActionPerformed

    private void addQuarterAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuarterAssessmentActionPerformed
        new AddQuarterAssessment().setVisible(true);
    }//GEN-LAST:event_addQuarterAssessmentActionPerformed

    private void addSemesterExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSemesterExamActionPerformed
        new AddSemesterExam().setVisible(true);
    }//GEN-LAST:event_addSemesterExamActionPerformed

    private void markAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markAssessmentActionPerformed
      if(listOfQuarterTests.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select an assessment");
        }else{
            String assessmentName = listOfQuarterTests.getSelectedValue();
            EffortGradeGenerator.primaryQuarterTest = assessmentName;
            new MarkQuarterAssessment().setVisible(true);
        }
    }//GEN-LAST:event_markAssessmentActionPerformed

    private void markSemesterExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markSemesterExamActionPerformed
        if(listOfSemesterExams.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Please select an assessment");
        }else{
            String assessmentName = listOfSemesterExams.getSelectedValue();
            EffortGradeGenerator.primarySemesterExam = assessmentName;
            new MarkSemesterExam().setVisible(true);
        }
    }//GEN-LAST:event_markSemesterExamActionPerformed

    private void generateEffort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateEffort1ActionPerformed
        if(listOfStudents.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Please select a student");
        }else{
            String studentName = (String)listOfStudents.getSelectedValue();
            String[] _arr = studentName.split("\\s");
             int id = Integer.parseInt(_arr[2]);
            ArrayList<Student> listOfStudentsClass = EffortGradeGenerator.primaryClass.getListOfStudents();
            for(int i =0; i<listOfStudentsClass.size(); i++){
            if(listOfStudentsClass.get(i).getId() == id){
                EffortGradeGenerator.primaryStudent = listOfStudentsClass.get(i);
            }
            }
            new EffortGradeHistory().setVisible(true);
        }
    }//GEN-LAST:event_generateEffort1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Homeworks;
    private javax.swing.JTabbedPane JTabbedPanePane;
    private javax.swing.JButton addHomework;
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton addQuarterAssessment;
    private javax.swing.JButton addSemesterExam;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton generateEffort;
    private javax.swing.JButton generateEffort1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listOfHomeworks;
    private javax.swing.JList<String> listOfQuarterTests;
    private javax.swing.JList<String> listOfSemesterExams;
    private javax.swing.JList<String> listOfStudents;
    private javax.swing.JButton markAssessment;
    private javax.swing.JButton markHomework;
    private javax.swing.JButton markSemesterExam;
    private javax.swing.JButton refresh;
    private javax.swing.JButton removeHomework;
    private javax.swing.JButton removeQuarterAssessment;
    private javax.swing.JButton removeSemesterExam;
    private javax.swing.JButton removeStudent;
    private javax.swing.JLabel signedInName;
    // End of variables declaration//GEN-END:variables
}
