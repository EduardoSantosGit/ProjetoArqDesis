package TO;

//import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import TO.LocacaoTO;

public class ListarLocacoesTO extends ArrayList <LocacaoTO>{
	
	private static final long serialVersionUID = 1L;
	
	public String toJSON(){
		JSONArray v = new JSONArray();
		Locale local = new Locale("pt","BR");
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT, local);
		for(LocacaoTO to:this){
			JSONObject obj = new JSONObject();
			try {
				obj.put("dataRetirada",to.dataRetirada);
				obj.put("dataDevolucao",to.dataDevolucao); 
				obj.put("localRetirada", to.localRetirada);
				obj.put("localDevolucao",to.localDevolucao);
				obj.put("tipoTarifa", to.tipoTarifa);
				obj.put("agenciaLocacao", to.agenciaLocacao);
				obj.put("agenciaPrevDevolucao", to.agenciaPrevDevolucao);
				obj.put("acrescimo", to.acrescimo);
				obj.put("kmLocacao", to.kmLocacao);
				obj.put("kmDevolucao", to.kmDevolucao);
				obj.put("numeroLocacao", to.codLocacao);
				obj.put("codVeiculo", to.codVeiculo);
				obj.put("codCliente", to.codCliente);
				v.put(obj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return v.toString();	
	}

}
