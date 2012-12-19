package com.shipco.hackathon;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class QT_Hackathon extends QWidget {

	Ui_QT_Hackathon ui = new Ui_QT_Hackathon();

	public static void main(String[] args) {
		QApplication.initialize(args);

		QT_Hackathon testQT_Hackathon = new QT_Hackathon();
		testQT_Hackathon.show();

		// Make change for GIT Try.

		QApplication.exec();
	}

	public QT_Hackathon() {
		ui.setupUi(this);
	}

	public QT_Hackathon(QWidget parent) {
		super(parent);
		ui.setupUi(this);
	}
}
