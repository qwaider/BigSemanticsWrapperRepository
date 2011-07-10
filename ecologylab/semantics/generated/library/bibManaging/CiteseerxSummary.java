package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  CiteseerxSummary.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Summary page from CiteSeerX.
 */ 
@simpl_inherit
public class CiteseerxSummary extends CiteseerxRecord
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL citationPage;

	/** 
	 * Papers that cite the same works.
	 */ 
	@simpl_scalar	private MetadataParsedURL activeBibliographyPage;

	/** 
	 * Papers that are cited by the same works.
	 */ 
	@simpl_scalar	private MetadataParsedURL cocitationPage;

	public CiteseerxSummary()
	{ }

	public CiteseerxSummary(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	citationPage()
	{
		MetadataParsedURL	result = this.citationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.citationPage = result;
		}
		return result;
	}

	public ParsedURL getCitationPage()
	{
		return this.citationPage().getValue();
	}

	public void setCitationPage(ParsedURL citationPage)
	{
		this.citationPage().setValue(citationPage);
	}

	public MetadataParsedURL	activeBibliographyPage()
	{
		MetadataParsedURL	result = this.activeBibliographyPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.activeBibliographyPage = result;
		}
		return result;
	}

	public ParsedURL getActiveBibliographyPage()
	{
		return this.activeBibliographyPage().getValue();
	}

	public void setActiveBibliographyPage(ParsedURL activeBibliographyPage)
	{
		this.activeBibliographyPage().setValue(activeBibliographyPage);
	}

	public MetadataParsedURL	cocitationPage()
	{
		MetadataParsedURL	result = this.cocitationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.cocitationPage = result;
		}
		return result;
	}

	public ParsedURL getCocitationPage()
	{
		return this.cocitationPage().getValue();
	}

	public void setCocitationPage(ParsedURL cocitationPage)
	{
		this.cocitationPage().setValue(cocitationPage);
	}

}
