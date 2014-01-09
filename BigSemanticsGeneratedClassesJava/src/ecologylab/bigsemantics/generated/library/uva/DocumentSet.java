package ecologylab.bigsemantics.generated.library.uva;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class DocumentSet extends Metadata
{
	@simpl_collection("document")
	@simpl_nowrap
	@mm_name("documents")
	private List<Document> documents;

	public DocumentSet()
	{ super(); }

	public DocumentSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Document> getDocuments()
	{
		return documents;
	}

  // lazy evaluation:
  public List<Document> documents()
  {
    if (documents == null)
      documents = new ArrayList<Document>();
    return documents;
  }

  // addTo:
  public void addToDocuments(Document element)
  {
    documents().add(element);
  }

  // size:
  public int documentsSize()
  {
    return documents == null ? 0 : documents.size();
  }

	public void setDocuments(List<Document> documents)
	{
		this.documents = documents;
	}
}
