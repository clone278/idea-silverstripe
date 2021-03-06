package com.raket.silverstripe.project;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: marcus
 * Date: 2013-04-12
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class SilverStripeProjectComponent implements ProjectComponent {
	private String silverStripeVersion;
	private VirtualFile versionFile;
	private PsiFile psiVersionFile;
	private Project project;
	private PsiElement[] phpMethods = PsiElement.EMPTY_ARRAY;

	public SilverStripeProjectComponent(Project project) {
		this.project = project;
	}

	public void initComponent() {
		// TODO: insert component initialization logic here
	}

	public void disposeComponent() {
		// TODO: insert component disposal logic here
	}

	@NotNull
	public String getComponentName() {
		return "SilverStripeProjectComponent";
	}

	public void projectOpened() {
		// called when project is opened

		VirtualFile versionFile = LocalFileSystem.getInstance().findFileByPath(project.getBasePath()
				+ File.separatorChar + "framework" + File.separatorChar + "silverstripe_version");
		if (versionFile != null) {
			this.versionFile = versionFile;
		}


	}

	public void projectClosed() {
		// called when project is being closed
	}

	public String getSilverStripeVersion() {
		if (versionFile != null && psiVersionFile == null) {
			psiVersionFile = PsiManager.getInstance(project).findFile(versionFile);
			silverStripeVersion = psiVersionFile.getText().trim();
		}
		return silverStripeVersion;
	}
}
