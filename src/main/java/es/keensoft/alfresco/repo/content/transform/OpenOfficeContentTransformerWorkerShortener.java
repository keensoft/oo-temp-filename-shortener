package es.keensoft.alfresco.repo.content.transform;

import org.alfresco.repo.content.transform.OpenOfficeContentTransformerWorker;

public class OpenOfficeContentTransformerWorkerShortener extends OpenOfficeContentTransformerWorker {

	@Override
	protected String getTempFilePrefix() {
		return "OOCT";
	}

}
