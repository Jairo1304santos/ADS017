
package negocio;

import dados.Aluno;
import dados.DadosException;


public class AlunoBO implements BO<Aluno> {

    @Override
    public void validar(Aluno entidade) throws NegocioException {
        if (entidade.getMatricula() == 0){
            throw new NegocioException ("Campo matricula maior que zero");
        }
        if (entidade.getNome() == null){
            throw new NegocioException ("Campo nome é obrigatório");
        }
    }

    @Override
    public void incluir(Aluno entidade) throws NegocioException {
        validar (entidade);
        AlunoDao dao = new AlunoDao();
        
        try {
            dao.incluir(entidade);
        } catch (Exception e) {
            throw new NegocioException("Erro");
            
        }
    }

    @Override
    public void alterar(Aluno entidade) throws NegocioException {
       validar(entidade);
       consultar(entidade);
       AlunoDao dao = new AlunoDao();
        
       try {
            
        } catch (Exception e) {
           throw new NegocioException("Erro", e); 
        }
       
    }

    @Override
    public void excluir(Aluno entidade) throws NegocioException {
        consultar(entidade);
        AlunoDao dao = new AlunoDao();
        try {
            dao.excluir(entidade.getId());
        } catch (Exception e) {
            throw new NegocioException("Erro", e);  
        }
    }

    @Override
    public Aluno consultar(Aluno entidade) throws NegocioException {
        Aluno aluno = new Aluno();
        AlunoDao dao = new AlunoDao();
        
        try {
            aluno = dao.consultar(entidade.getId());
        } catch (Exception e) {
              throw new NegocioException("Erro", e); 
        }
        if (aluno == null || aluno.getId() == 0){
             throw new NegocioException("Aluno não encontrado");
        }
    
    }
    
}    

