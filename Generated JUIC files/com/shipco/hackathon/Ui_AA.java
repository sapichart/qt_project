/********************************************************************************
** Form generated from reading ui file 'AA.jui'
**
** Created: Tue Dec 18 17:01:08 2012
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package com.shipco.hackathon;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_AA implements com.trolltech.qt.QUiForm<QDialog>
{
    public QDialogButtonBox buttonBox;

    public Ui_AA() { super(); }

    public void setupUi(QDialog AA)
    {
        AA.setObjectName("AA");
        AA.resize(new QSize(400, 300).expandedTo(AA.minimumSizeHint()));
        buttonBox = new QDialogButtonBox(AA);
        buttonBox.setObjectName("buttonBox");
        buttonBox.setGeometry(new QRect(30, 240, 341, 31));
        buttonBox.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.TabFocus);
        buttonBox.setStandardButtons(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.createQFlags(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Cancel,com.trolltech.qt.gui.QDialogButtonBox.StandardButton.NoButton,com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Ok));
        retranslateUi(AA);

        AA.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog AA)
    {
        AA.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("AA", "Dialog", null));
    } // retranslateUi

}

