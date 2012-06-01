//
// ScholarlyArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.creative_work;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.scholarlyPublication 
{
	[SimplInherit]
	public class ScholarlyArticle : CreativeWork
	{
		/// <summary>
		/// Metadata related to where this article was published.
		/// </summary>
		[SimplComposite]
		[MmName("source")]
		private Periodical source;

		/// <summary>
		/// Papers cited by this paper.
		/// </summary>
		[SimplCollection("reference")]
		[MmName("references")]
		private List<ScholarlyArticle> references;

		/// <summary>
		/// Papers that cite this paper.
		/// </summary>
		[SimplCollection("citation")]
		[MmName("citations")]
		private List<ScholarlyArticle> citations;

		/// <summary>
		/// The Classifications of this paper.
		/// </summary>
		[SimplCollection("tag")]
		[MmName("classifications")]
		private List<Tag> classifications;

		/// <summary>
		/// Key Terms of the paper.
		/// </summary>
		[SimplCollection("tag")]
		[MmName("keywords")]
		private List<Tag> keywords;

		[SimplScalar]
		private MetadataString pages;

		public ScholarlyArticle()
		{ }

		public ScholarlyArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Periodical Source
		{
			get{return source;}
			set
			{
				if (this.source != value)
				{
					this.source = value;
					this.RaisePropertyChanged( () => this.Source );
				}
			}
		}

		public List<ScholarlyArticle> References
		{
			get{return references;}
			set
			{
				if (this.references != value)
				{
					this.references = value;
					this.RaisePropertyChanged( () => this.References );
				}
			}
		}

		public List<ScholarlyArticle> Citations
		{
			get{return citations;}
			set
			{
				if (this.citations != value)
				{
					this.citations = value;
					this.RaisePropertyChanged( () => this.Citations );
				}
			}
		}

		public List<Tag> Classifications
		{
			get{return classifications;}
			set
			{
				if (this.classifications != value)
				{
					this.classifications = value;
					this.RaisePropertyChanged( () => this.Classifications );
				}
			}
		}

		public List<Tag> Keywords
		{
			get{return keywords;}
			set
			{
				if (this.keywords != value)
				{
					this.keywords = value;
					this.RaisePropertyChanged( () => this.Keywords );
				}
			}
		}

		public MetadataString Pages
		{
			get{return pages;}
			set
			{
				if (this.pages != value)
				{
					this.pages = value;
					this.RaisePropertyChanged( () => this.Pages );
				}
			}
		}
	}
}