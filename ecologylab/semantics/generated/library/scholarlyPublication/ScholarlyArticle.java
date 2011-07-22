package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.generated.library.Tag;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.scholarlyPublication.Source;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;

/**
*  ScholarlyArticle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class ScholarlyArticle extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("abstract")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString abstractField;

	/** 
	 * Set of authors.
	 */ 
	@simpl_collection("author") @mm_name("authors")	private List<Author> authors;

	/** 
	 * Metadata related to where this article was published.
	 */ 
	@simpl_composite @mm_name("source")	private Source source;

	/** 
	 * citation.cfm
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL metadataPage;

	/** 
	 * Papers cited by this paper.
	 */ 
	@simpl_collection("reference") @mm_name("references")	private List<ScholarlyArticle> references;

	/** 
	 * Papers that cite this paper.
	 */ 
	@simpl_collection("citation") @mm_name("citations")	private List<ScholarlyArticle> citations;

	/** 
	 * The Classifications of this paper.
	 */ 
	@simpl_collection("tag") @mm_name("classifications")	private List<Tag> classifications;

	/** 
	 * Key Terms of the paper.
	 */ 
	@simpl_collection("tag") @mm_name("keywords")	private List<Tag> keywords;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString pages;

	public ScholarlyArticle()
	{ }

	public ScholarlyArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	abstractField()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public java.lang.String getAbstractField()
	{
		return this.abstractField == null ? null : abstractField().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(java.lang.String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(ecologylab.semantics.metadata.scalar.MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public List<Author> getAuthors()
	{
		return authors;
	}

	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}

	public Source getSource()
	{
		return source;
	}

	public void setSource(Source source)
	{
		this.source = source;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	metadataPage()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.metadataPage;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.metadataPage = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getMetadataPage()
	{
		return this.metadataPage == null ? null : metadataPage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getMetadataPageMetadata()
	{
		return metadataPage;
	}

	public void setMetadataPage(ecologylab.net.ParsedURL metadataPage)
	{
		if (metadataPage != null)
			this.metadataPage().setValue(metadataPage);
	}

	public void setMetadataPageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL metadataPage)
	{
		this.metadataPage = metadataPage;
	}

	public List<ScholarlyArticle> getReferences()
	{
		return references;
	}

	public void setReferences(List<ScholarlyArticle> references)
	{
		this.references = references;
	}

	public List<ScholarlyArticle> getCitations()
	{
		return citations;
	}

	public void setCitations(List<ScholarlyArticle> citations)
	{
		this.citations = citations;
	}

	public List<Tag> getClassifications()
	{
		return classifications;
	}

	public void setClassifications(List<Tag> classifications)
	{
		this.classifications = classifications;
	}

	public List<Tag> getKeywords()
	{
		return keywords;
	}

	public void setKeywords(List<Tag> keywords)
	{
		this.keywords = keywords;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	pages()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.pages;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.pages = result;
		}
		return result;
	}

	public java.lang.String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(java.lang.String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}
}
