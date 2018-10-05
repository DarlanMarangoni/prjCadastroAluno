package managedBeans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Aluno;

@ManagedBean
@SessionScoped
public class AlunoMB {

	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Aluno aluno = new Aluno();

	public void salvar() {
		alunos.add(aluno);
		aluno = new Aluno();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
