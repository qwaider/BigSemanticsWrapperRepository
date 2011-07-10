package ecologylab.semantics.generated.library.uva;

import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  DocumentSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class DocumentSet extends Metadata
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("document") @mm_name("documents")	private ArrayList<Document> documents;

	public DocumentSet()
	{ }

	public DocumentSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<Document> getDocuments()
	{
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents)
	{
		this.documents = documents;
	}
}
